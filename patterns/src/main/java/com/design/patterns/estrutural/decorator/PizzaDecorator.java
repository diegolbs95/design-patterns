package com.design.patterns.estrutural.decorator;

abstract class PizzaDecorator implements Pizza {

    private final Pizza pizza;

    protected PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }

    @Override
    public Double valor() {
        return pizza.valor();
    }
}
