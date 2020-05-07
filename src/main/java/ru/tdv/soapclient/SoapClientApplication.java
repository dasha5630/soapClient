package ru.tdv.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.tdv.soapclient.schemas.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            EnumSchemas enumSchemas = new EnumSchemas();
            EnumSchemasResponse enumSchemasResponse = (EnumSchemasResponse) soapConnector.callWebService(enumSchemas);

            //enumSchemasResponse.getEnumSchemasResult().getRSchema().stream().forEach(x->System.out.println(x.getID() + " " + x.getID()));
            //todo: implement getStage
            List<String> lst = new ArrayList<String>();
            lst = enumSchemasResponse.getEnumSchemasResult().getRSchema().stream().flatMap(x->Stream.of(x.getID())).collect(Collectors.toList());
            String[] lt;
            lt = enumSchemasResponse.getEnumSchemasResult().getRSchema().stream().flatMap(x->Stream.of(x.getID())).toArray(String[]::new);
            lt = lt;

            EnumDevices enumDevices = new EnumDevices();
            enumDevices.setSchemaID(lt[0]);
            EnumDevicesResponse enumDevicesResponse = (EnumDevicesResponse) soapConnector.callWebService(enumDevices);
            REnumDevices rEnumDevices = enumDevicesResponse.getEnumDevicesResult();

            rEnumDevices.getGroups().getRGroupItem().stream().map(x->x.getName()).forEach(System.out::println);
            List<RDeviceItem> rDeviceItemList = rEnumDevices.getItems().getRDeviceItem();

            ArrayOfGuid arrayOfGuid = new ArrayOfGuid();

            rEnumDevices.getItems().getRDeviceItem().stream().forEach(x->arrayOfGuid.getGuid().add(x.getID()));

            GetProperty getProperty = new GetProperty();
            getProperty.setDeviceIDs(arrayOfGuid);
            getProperty.setPropertyName("VehicleRegNumber");
            getProperty.setSchemaID(lt[0]);
            GetPropertyResponse getPropertyResponse = (GetPropertyResponse) soapConnector.callWebService(getProperty);
            List<RPropertyItem1C> rPropertyItem1CList = getPropertyResponse.getGetPropertyResult().getRPropertyItem1C();

            for (RDeviceItem item: rDeviceItemList) {
                rPropertyItem1CList.stream()
                        .filter(x->x.getID().equals(item.getID()))
                        .map(x->item.getName()+ " " + item.getSerial() + " " + x.getValue())
                        .forEach(System.out::println);
            }

//            deviceStream.map(x->x.getName() + " " + x.getSerial()).forEachOrdered(System.out::println);
//            arrayOfRPropertyItem1C.getRPropertyItem1C().stream().map(x->x.getValue()).forEachOrdered(System.out::println);



/*
            EnumGeoFences enumGeoFences = new EnumGeoFences();
            enumGeoFences.setSchemaID(lt[0]);
            EnumGeoFencesResponse enumGeoFencesResponse = (EnumGeoFencesResponse) soapConnector.callWebService(enumGeoFences);
*/


        };
    }
}
