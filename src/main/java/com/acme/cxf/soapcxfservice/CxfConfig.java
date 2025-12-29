package com.acme.cxf.soapcxfservice;

// Fichier: src/main/java/com/acme/cxf/soapcxfservice/config/CxfConfig.jav
import com.acme.cxf.soapcxfservice.impl.HelloServiceImpl;
import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Bean
    public EndpointImpl helloEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloServiceImpl());
        endpoint.publish("/hello");
        return endpoint;
    }
}
