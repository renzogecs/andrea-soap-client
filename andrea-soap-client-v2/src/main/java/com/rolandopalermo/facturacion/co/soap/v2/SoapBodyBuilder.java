package com.rolandopalermo.facturacion.co.soap.v2;

import com.anjus.commons.enums.Environment;
import lombok.Builder;

@Builder
public final class SoapBodyBuilder {

    private Environment environment;

    public String getStatus(String trackId) {
        String soapRequest = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:wcf=\"http://wcf.dian.colombia\">" +
                "    <soap:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">" +
                "        <wsa:Action>http://wcf.dian.colombia/IWcfDianCustomerServices/GetStatus</wsa:Action>" +
                "        <wsa:To xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">%s</wsa:To>" +
                "    </soap:Header>" +
                "    <soap:Body>" +
                "        <wcf:GetStatus>" +
                "            <wcf:trackId>%s</wcf:trackId>" +
                "        </wcf:GetStatus>" +
                "    </soap:Body>" +
                "</soap:Envelope>";
        return String.format(soapRequest, environment.getBaseWsdl(), trackId);
    }

    public String sendBillSync(String fileName, String contentFile) {
        String soapRequest = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:wcf=\"http://wcf.dian.colombia\">" +
                "   <soap:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">" +
                "        <wsa:Action>http://wcf.dian.colombia/IWcfDianCustomerServices/SendBillSync</wsa:Action>" +
                "        <wsa:To xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">%s</wsa:To>" +
                "    </soap:Header>" +
                "   <soap:Body>" +
                "      <wcf:SendBillSync>" +
                "         <wcf:fileName>%s</wcf:fileName>" +
                "         <wcf:contentFile>%s</wcf:contentFile>" +
                "      </wcf:SendBillSync>" +
                "   </soap:Body>" +
                "</soap:Envelope>";
        return String.format(soapRequest, environment.getBaseWsdl(), fileName, contentFile);
    }

    public String sendTestSetAsync(String fileName, String contentFile, String testSetId) {
        String soapRequest = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:wcf=\"http://wcf.dian.colombia\">" +
                "   <soap:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">" +
                "        <wsa:Action>http://wcf.dian.colombia/IWcfDianCustomerServices/SendTestSetAsync</wsa:Action>" +
                "        <wsa:To xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">%s</wsa:To>" +
                "   </soap:Header>" +
                "   <soap:Body>" +
                "      <wcf:SendTestSetAsync>" +
                "         <wcf:fileName>%s</wcf:fileName>" +
                "         <wcf:contentFile>%s</wcf:contentFile>" +
                "         <wcf:testSetId>%s</wcf:testSetId>" +
                "      </wcf:SendTestSetAsync>" +
                "   </soap:Body>" +
                "</soap:Envelope>";
        return String.format(soapRequest, environment.getBaseWsdl(), fileName, contentFile, testSetId);
    }

    public String getStatusZip(String trackId) {
        String soapRequest = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:wcf=\"http://wcf.dian.colombia\">" +
                "   <soap:Header xmlns:wsa=\"http://www.w3.org/2005/08/addressing\">" +
                "        <wsa:Action>http://wcf.dian.colombia/IWcfDianCustomerServices/GetStatus</wsa:Action>" +
                "        <wsa:To xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">%s</wsa:To>" +
                "   </soap:Header>" +
                "   <soap:Body>" +
                "      <wcf:GetStatus>" +
                "         <wcf:trackId>%s</wcf:trackId>" +
                "      </wcf:GetStatus>" +
                "   </soap:Body>" +
                "</soap:Envelope>";
        return String.format(soapRequest, environment.getBaseWsdl(), trackId);
    }

}