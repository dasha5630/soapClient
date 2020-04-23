package ru.tdv.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.tdv.soapclient.schemas.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class SoapClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
//http://м.тм-вол.рф/Service1C.asmx?WSDL"
        /*try {
            URL url = new URL("http://xn--l1a.xn----dtb1abmu.xn--p1ai/ServiceJSON/Login");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);
            String jsonInputString = "{\"UserName\":\"demo\",\"Password\":\"demo\"}";

            try(OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    @Bean
    CommandLineRunner lookup(SOAPConnector soapConnector) {
        return args -> {
            if(args.length>0){
            }
            EnumSchemas request = new EnumSchemas();
            EnumSchemasResponse response =(EnumSchemasResponse) soapConnector.callWebService("http://xn--l1a.xn----dtb1abmu.xn--p1ai/Service1C.asmx", request);
            System.out.println(response.getEnumSchemasResult().toString());
        };
    }
}
