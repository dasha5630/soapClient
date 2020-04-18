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


	/*
	WebClient client = new WebClient();
	client.Headers["Content-Type"] = "application/json";
	var session = client.DownloadString("http://localhost:8300/Login?UserName=demo&Password=demo").Trim('\"', '\"'); // метод GET

	// далее обычная работа с JSON
	client.DownloadString("http://localhost:8300/EnumSchemas?session="+session);

	//get AG-TOKEN
http://localhost:8300/Login?UserName=demo&Password=demo	HttpURLConnection con = (HttpURLConnection) url.openConnection();
	con.setRequestMethod("GET");
	 */
	@Bean
	public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
		SOAPConnector client = new SOAPConnector();
		client.setDefaultUri("http://м.тм-вол.рф/Accaunt/Login");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);

		WebServiceTemplate template = client.getWebServiceTemplate();
		template.setMessageSender(new AuthConfiguration());
		return client;
	}

}
