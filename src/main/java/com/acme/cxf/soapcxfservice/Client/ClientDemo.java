package com.acme.cxf.soapcxfservice.Client;

import com.acme.cxf.soapcxfservice.impl.HelloServiceImpl;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.URL;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
        URL wsdl = new URL("http://localhost:8080/services/hello?wsdl");
        QName qname = new QName("http://api.cxf.acme.com/", "HelloService");
        Service svc = Service.create(wsdl, qname);
        HelloServiceImpl port = svc.getPort(HelloServiceImpl.class);

        System.out.println(port.sayHello("ClientJava"));
        System.out.println(port.findPersonById("P-777").getName());
    }
}
