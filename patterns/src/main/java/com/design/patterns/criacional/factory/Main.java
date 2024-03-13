package com.design.patterns.criacional.factory;

import static com.design.patterns.criacional.factory.PizzaFactory.criarProduto;

public class Main {

    public static void main(String[] args) {

        var pizzaDoce = criarProduto("DOCE");
        var pizzaSalgada = criarProduto("SALGADA");

        pizzaDoce.operacao();
        pizzaSalgada.operacao();
    }
}