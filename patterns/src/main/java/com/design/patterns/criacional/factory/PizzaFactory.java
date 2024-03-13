package com.design.patterns.criacional.factory;

public class PizzaFactory {

    public static Produto criarProduto(String tipoPizza) {
        return tipoPizza.equalsIgnoreCase("Doce") ? new PizzaDoce() : new PizzaSalgada();
    }
}
