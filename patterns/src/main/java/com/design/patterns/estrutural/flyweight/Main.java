package com.design.patterns.estrutural.flyweight;

public class Main {

    public static void main(String[] args) {

        var factory = new CaracterFactory();

        var a = factory.getCaracter('A');
        var b = factory.getCaracter('B');
        var c = factory.getCaracter('A');

        a.imprimir();
        b.imprimir();
        c.imprimir();

        System.out.println("A é a mesma instância que C? " + (a == c));
    }
}
