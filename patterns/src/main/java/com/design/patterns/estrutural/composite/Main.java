package com.design.patterns.estrutural.composite;

public class Main {

    public static void main(String[] args) {

        var folha1 = new Folha("Folha 1");
        var folha2 = new Folha("Folha 2");
        var folha3 = new Folha("Folha 3");

        var composto = new Composto();
        composto.adicionar(folha1);
        composto.adicionar(folha2);

        var composto2 = new Composto();
        composto2.adicionar(folha3);
        composto2.adicionar(composto);

        folha1.operacao();
        folha2.operacao();
        folha3.operacao();

        System.out.println("----");

        composto.operacao();

        System.out.println("----");

        composto2.operacao();
    }
}
