package com.design.patterns.estrutural.bridge;

public class Main {

    public static void main(String[] args) {

        var vermelho = new Vermelho();
        var circulo = new Circulo(vermelho);

        circulo.aplicarCor();

        var azul = new Azul();
        var quadrado = new Quadrado(azul);

        quadrado.aplicarCor();
    }
}
