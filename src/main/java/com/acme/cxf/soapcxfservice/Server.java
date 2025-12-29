package com.acme.cxf.soapcxfservice;

import com.acme.cxf.soapcxfservice.api.HelloService; // Notez le bon package
import com.acme.cxf.soapcxfservice.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {
    public static void main(String[] args) {
        String address = "http://localhost:8081/services/hello";
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloServiceImpl.class);
        factory.setAddress(address);
        factory.create();
        System.out.println("WSDL: " + address + "?wsdl");
    }
}