package com.design.patterns.estrutural.flyweight;

public class CaracterImpl implements Caracter {

    private char simbolo;

    public CaracterImpl(char simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public void imprimir() {
        System.out.println("Character: " + simbolo);
    }
}