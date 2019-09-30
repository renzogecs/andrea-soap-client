package com.rolandopalermo.facturacion.co.soap.v2;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;

public final class DianSoapWsClient {

    private DianSoapWsClient() {
    }

    public static String sendRequest(String wsdl, String soapRequest) throws IOException {
        String responseString;
        StringBuffer soapResponse = new StringBuffer();
        URL url = new URL(wsdl);
        HttpsURLConnection httpConn = (HttpsURLConnection) url.openConnection();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        byte[] buffer = soapRequest.getBytes();
        bout.write(buffer);
        byte[] b = bout.toByteArray();
        httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
        httpConn.setRequestProperty("Content-Type", "application/soap+xml;charset=UTF-8");
        httpConn.setRequestMethod("POST");
        httpConn.setDoOutput(true);
        httpConn.setDoInput(true);
        OutputStream out = httpConn.getOutputStream();
        out.write(b);
        out.close();
        InputStream _is;
        if (httpConn.getResponseCode() <= 400) {
            _is = httpConn.getInputStream();
        } else {
            _is = httpConn.getErrorStream();
        }
        InputStreamReader isr = new InputStreamReader(_is, Charset.forName("UTF-8"));
        BufferedReader in = new BufferedReader(isr);
        while ((responseString = in.readLine()) != null) {
            soapResponse.append(responseString);
        }
        return soapResponse.toString();
    }

}