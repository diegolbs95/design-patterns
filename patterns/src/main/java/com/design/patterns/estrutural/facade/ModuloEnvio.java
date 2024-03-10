package com.design.patterns.estrutural.facade;

public class ModuloEnvio {

    public void envioProduto(String produto, String endereco) {
        System.out.println("Enviando produto " + produto + " para o endereço: " + endereco);
    }
}
