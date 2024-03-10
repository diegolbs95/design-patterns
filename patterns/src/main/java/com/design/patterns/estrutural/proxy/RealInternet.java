package com.design.patterns.estrutural.proxy;

public class RealInternet implements Internet{

    @Override
    public void conectar(String serverHost) {
        System.out.println("Conectando-se ao servidor: " + serverHost);
    }
}
