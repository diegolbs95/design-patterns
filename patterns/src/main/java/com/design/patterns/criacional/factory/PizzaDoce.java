package com.design.patterns.criacional.factory;

public class PizzaDoce implements Produto{

    @Override
    public void operacao() {
        System.out.println("Contruindo pizza doce.");
    }
}
