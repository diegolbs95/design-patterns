package com.design.patterns.comportamental.command;

public class DesativarComando implements Comando{

    private final Luz luz;

    DesativarComando(Luz luz) {
        this.luz = luz;
    }
    @Override
    public void execute() {
        luz.desligar();
    }
}