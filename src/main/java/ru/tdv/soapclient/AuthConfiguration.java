package ru.tdv.soapclient;

import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.net.HttpURLConnection;

public class AuthConfiguration extends HttpUrlConnectionMessageSender {

        @Override
        protected void prepareConnection(HttpURLConnection connection)
                throws IOException {

          BASE64Encoder enc = new sun.misc.BASE64Encoder();
            String userpassword = "demo:demo";
            String encodedAuthorization = enc.encode( userpassword.getBytes() );
            connection.setRequestProperty("Authorization", "Basic " + encodedAuthorization);

            super.prepareConnection(connection);

        }
}
