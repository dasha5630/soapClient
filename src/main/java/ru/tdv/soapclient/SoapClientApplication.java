package ru.tdv.soapclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.tdv.soapclient.schemas.*;
import sun.security.util.Password;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SoapClientApplication {
    public static String login;
    public static String password;
    public static XMLGregorianCalendar calendar;
    public static Instant currentTime;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Login: ");
        login = in.nextLine();
        System.out.print("Password: ");
        password = in.nextLine();
        currentTime = Instant.now();
        SpringApplication.run(SoapClientApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(SOAPConnector soapConnector) {
        return args -> {
            if(args.length>0){
            }
            EnumSchemas enumSchemas = new EnumSchemas();
            EnumSchemasResponse enumSchemasResponse = (EnumSchemasResponse) soapConnector.callWebService(enumSchemas);

            List<String> lst = new ArrayList<String>();
            lst = enumSchemasResponse.getEnumSchemasResult().getRSchema().stream().flatMap(x->Stream.of(x.getID())).collect(Collectors.toList());
            String[] lt = enumSchemasResponse.getEnumSchemasResult().getRSchema().stream().flatMap(x->Stream.of(x.getID())).toArray(String[]::new);
            String schema = lt[0];

            EnumDevices enumDevices = new EnumDevices();
            enumDevices.setSchemaID(schema);
            EnumDevicesResponse enumDevicesResponse = (EnumDevicesResponse) soapConnector.callWebService(enumDevices);
            REnumDevices rEnumDevices = enumDevicesResponse.getEnumDevicesResult();

            List<RGroupItem> rGroupItemList = rEnumDevices.getGroups().getRGroupItem();
            List<RDeviceItem> rDeviceItemList = rEnumDevices.getItems().getRDeviceItem();
            ArrayOfGuid deviceIDs = new ArrayOfGuid();

            rEnumDevices.getItems().getRDeviceItem().stream().forEach(x->deviceIDs.getGuid().add(x.getID()));

            GetProperty getProperty = new GetProperty();
            getProperty.setDeviceIDs(deviceIDs);
            getProperty.setPropertyName("VehicleRegNumber");
            getProperty.setSchemaID(schema);
            GetPropertyResponse getPropertyResponse = (GetPropertyResponse) soapConnector.callWebService(getProperty);
            List<RPropertyItem1C> rPropertyItem1CList = getPropertyResponse.getGetPropertyResult().getRPropertyItem1C();

            EnumGeoFences enumGeoFences = new EnumGeoFences();
            enumGeoFences.setSchemaID(schema);
            EnumGeoFencesResponse geoFencesResponse = (EnumGeoFencesResponse) soapConnector.callWebService(enumGeoFences);
            List<RGeofenceItem> rGeofenceItemList = geoFencesResponse.getEnumGeoFencesResult().getItems().getRGeofenceItem();

            String dateTimeString = currentTime.toString();
            XMLGregorianCalendar date2
                    = DatatypeFactory.newInstance().newXMLGregorianCalendar(dateTimeString);

            GetStage getStage = new GetStage();
            getStage.setDeviceIDs(deviceIDs);
            getStage.setSchemaID(schema);
            getStage.setED(date2);
            getStage.setSD(date2);

            //view
            rGroupItemList.stream().map(RGroupItem::getName).forEach(System.out::println);

            for (RDeviceItem item: rDeviceItemList) {
                rPropertyItem1CList.stream()
                        .filter(x->x.getID().equals(item.getID()))
                        .map(x->item.getName()+ " " + item.getSerial() + " " + x.getValue())
                        .forEach(System.out::println);
            }

            for (RGeofenceItem item: rGeofenceItemList) {
                int [] fixingDays = item.getProperties().getRProperty().stream()
                        .filter(x->x.getName().equals("FixingDays"))
                        .mapToInt(x->((Number)x.getValue()).intValue()).toArray();
//                LocalDateTime[] fixNumberDate = item.getProperties().getRProperty().stream()
//                        .filter(x->x.getName().equals("FixNumberDate"))
//                        .map(x->((LocalDateTime)x.getValue())).collect(x->(LocalDateTime)x);
                System.out.print(item.getName() + "      ");
                for(int i = 1; i < 7; i++){
                    System.out.print(((fixingDays[0] & (1 << i)) != 0) ? 1 : 0);
                    System.out.print(" ");
                }
                System.out.print(((fixingDays[0] & 1) != 0) ? 1 : 0);
                System.out.println();
            }
        };
    }
}
