package com.design.patterns.estrutural.proxy;

public class Main {

    public static void main(String[] args) {

        var internet = new ProxyInternet();

        try {
            internet.conectar("exemplo.com");
            internet.conectar("blocked.com");
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
