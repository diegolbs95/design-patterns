package com.design.patterns.estrutural.bridge;

public class Quadrado implements FormaGeometrica {

    private final Cor cor;

    public Quadrado(Cor cor) {
        this.cor = cor;
    }

    @Override
    public void aplicarCor() {
        System.out.println("Quadrado cheio de cor ");
        cor.aplicarCor();
    }
}
