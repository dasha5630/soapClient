package ru.tdv.soapclient;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import ru.tdv.soapclient.schemas.GetTripsTotalResponse;

public class SOAPConnector extends WebServiceGatewaySupport {

	public Object callWebService(String url, Object request){
			return getWebServiceTemplate().marshalSendAndReceive(request, new SoapActionCallback("http://tempuri.org/EnumSchemas"));
	}
}