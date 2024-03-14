package com.design.patterns.comportamental.command;

public class Main {

    public static void main(String[] args) {

        var luz = new Luz();

        var ligarLuz = new AtivarComando(luz);
        var desligarLuz = new DesativarComando(luz);

        var controle = new ControleRemoto();

        controle.setComando(ligarLuz);
        controle.precionarBotao();

        controle.setComando(desligarLuz);
        controle.precionarBotao();
    }
}