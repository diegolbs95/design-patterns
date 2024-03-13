package com.design.patterns.criacional.prototype;

public class Main {

    public static void main(String[] args) {

        var prototype1 = new PrototypeConcreto1();
        var prototype2 = new PrototypeConcreto2();

        //Fazendo a clonagem
        var clone1 = prototype1.clonar();
        var clone2 = prototype2.clonar();

        System.out.println("Clone 1: " + clone1);
        System.out.println("Clone 2: " + clone2);
    }
}