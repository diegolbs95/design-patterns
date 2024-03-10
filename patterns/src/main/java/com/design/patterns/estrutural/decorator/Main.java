package com.design.patterns.estrutural.decorator;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new PizzaSimples();
        System.out.println("Descrição: " + pizza.getDescricao());
        System.out.println("Preço: $" + pizza.valor());

        System.out.println("------------------------------");

        pizza = new CheeseDecorator(pizza);
        System.out.println("Descrição: " + pizza.getDescricao());
        System.out.println("Preço: $" + pizza.valor());

        System.out.println("------------------------------");

        pizza = new PizzaSimples();
        pizza = new PepperoniDecorator(pizza);
        System.out.println("Descrição: " + pizza.getDescricao());
        System.out.println("Preço: $" + pizza.valor());

    }
}
