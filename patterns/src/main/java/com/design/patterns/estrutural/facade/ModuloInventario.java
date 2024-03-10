package com.design.patterns.estrutural.facade;

public class ModuloInventario {

    public void updateInventario(String produto, Integer quantidade) {
        System.out.println("Atualizando estoque do produto " + produto + " para " + quantidade + " unidades");
    }
}
