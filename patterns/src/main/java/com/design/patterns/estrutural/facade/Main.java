package com.design.patterns.estrutural.facade;

public class Main {

    public static void main(String[] args) {

        var lojaFacade = new LojaOnlineFacade();
        lojaFacade.comprarProduto("Notebook", "Cartão de Crédito",
                1500.0, 1, "Vila Feliz");
    }
}
