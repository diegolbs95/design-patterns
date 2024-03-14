package com.design.patterns.comportamental.command;

public class AtivarComando implements Comando{

    private final Luz luz;

    AtivarComando(Luz luz) {
        this.luz = luz;
    }
    @Override
    public void execute() {
        luz.ligar();
    }
}