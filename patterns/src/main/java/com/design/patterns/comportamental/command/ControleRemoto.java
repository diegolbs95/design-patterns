package com.design.patterns.comportamental.command;

public class ControleRemoto {

    private Comando comando;

    void setComando(Comando comando){
        this.comando = comando;
    }

    void precionarBotao() {
        comando.execute();
    }
}