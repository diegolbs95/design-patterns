package com.design.patterns.criacional.factory;

public class PizzaSalgada implements Produto{

    @Override
    public void operacao() {
        System.out.println("Contruindo pizza salgada.");
    }
}
