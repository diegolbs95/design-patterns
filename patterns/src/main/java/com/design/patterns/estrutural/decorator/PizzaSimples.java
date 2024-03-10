package com.design.patterns.estrutural.decorator;

public class PizzaSimples implements Pizza {

    @Override
    public String getDescricao() {
        return "Pizza Simples";
    }

    @Override
    public Double valor() {
        return 5.0;
    }
}
