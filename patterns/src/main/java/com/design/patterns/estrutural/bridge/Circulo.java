package com.design.patterns.estrutural.bridge;

public class Circulo implements FormaGeometrica {

    private final Cor cor;

    public Circulo(Cor cor) {
        this.cor = cor;
    }

    @Override
    public void aplicarCor() {
        System.out.println("Circulo cheio de cor ");
        cor.aplicarCor();
    }
}
