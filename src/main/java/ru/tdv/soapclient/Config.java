package ru.tdv.soapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class Config {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this is the package name specified in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("ru.tdv.soapclient.schemas");
		return marshaller;
	}

	@Bean
	public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
		SOAPConnector client = new SOAPConnector();
		client.setDefaultUri("http://xn--l1a.xn----dtb1abmu.xn--p1ai/Service1C.asmx");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);

		WebServiceTemplate template = client.getWebServiceTemplate();
		template.setMessageSender(new AuthConfiguration());
		return client;
	}

}
