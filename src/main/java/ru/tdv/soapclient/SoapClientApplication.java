package ru.tdv.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.tdv.soapclient.schemas.*;

import java.net.HttpURLConnection;

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
            EnumSchemasResponse response =(EnumSchemasResponse) soapConnector.callWebService("http://м.тм-вол.рф/", request);
            System.out.println(response.getEnumSchemasResult().toString());
        };
    }
}
