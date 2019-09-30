package com.rolandopalermo.facturacion.co.soap.v2.utils;

public enum Environment {

    DEV("https://vpfe-hab.dian.gov.co/WcfDianCustomerServices.svc");

    private String baseWsdl;

    private Environment(String baseWsdl) {
        this.baseWsdl = baseWsdl;
    }

    public String getBaseWsdl() {
        return this.baseWsdl;
    }

}