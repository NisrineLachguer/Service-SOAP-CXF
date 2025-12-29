package com.acme.cxf.soapcxfservice.impl;


import com.acme.cxf.soapcxfservice.api.HelloService;
import com.acme.cxf.soapcxfservice.model.Person;
import jakarta.jws.WebService;

@WebService(
        serviceName = "HelloService",
        portName = "HelloServicePort",
//      endpointInterface = "com.acme.cxf.api.HelloService",
        endpointInterface = "com.acme.cxf.soapcxfservice.api.HelloService",

        targetNamespace = "http://api.cxf.acme.com/"
)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Bonjour, " + (name == null ? "inconnu" : name);
    }

    @Override
    public Person findPersonById(String id) {
        return new Person(id, "Ada Lovelace", 36); // maquette
    }
}
