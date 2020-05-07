package ru.tdv.soapclient;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SOAPConnector extends WebServiceGatewaySupport {

	public Object callWebService(Object request){
		//todo: add parameter from request to SoapActionCallback
		return getWebServiceTemplate().marshalSendAndReceive(request, new SoapActionCallback("http://tempuri.org/" + request.getClass().getSimpleName()));
	}
}