package com.design.patterns.criacional.singleton;

public class Main {

    public static void main(String[] args) {

        var singleton = Singleton.getInstancia();
        var singleton2 = Singleton.getInstancia();

        //Mesmo chamando duas vezes o getInstancia ele retorna o mesmo objeto da memoria
        System.out.println(singleton);
        System.out.println(singleton2);
    }
}
