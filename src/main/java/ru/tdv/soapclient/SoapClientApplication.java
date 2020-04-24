package ru.tdv.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.tdv.soapclient.schemas.*;

@SpringBootApplication
public class SoapClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(SOAPConnector soapConnector) {
        return args -> {
            if(args.length>0){
            }
            EnumSchemas request = new EnumSchemas();
            EnumSchemasResponse response =(EnumSchemasResponse) soapConnector.callWebService("http://xn--l1a.xn----dtb1abmu.xn--p1ai/Service1C.asmx", request);
            response.getEnumSchemasResult().getRSchema().stream().forEach(x->System.out.println(x.getID() + " " + x.getID()));
        };
    }
}
