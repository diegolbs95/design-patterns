package com.design.patterns.estrutural.decorator;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com queijo";
    }

    @Override
    public Double valor() {
        return super.valor() + 1.5;
    }
}
