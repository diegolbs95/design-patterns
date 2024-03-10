package com.design.patterns.estrutural.decorator;

public class PepperoniDecorator extends PizzaDecorator {

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com pepperoni";
    }

    @Override
    public Double valor() {
        return super.valor() + 2.0;
    }
}
