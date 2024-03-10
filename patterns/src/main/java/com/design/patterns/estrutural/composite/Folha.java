package com.design.patterns.estrutural.composite;

public class Folha implements Componente {

    private final String nome;

    public Folha(String nome) {
        this.nome = nome;
    }

    @Override
    public void operacao() {
        System.out.println("Operação executada em " + nome);
    }
}
