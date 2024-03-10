package com.design.patterns.estrutural.facade;

public class ModuloPagamento {

    public void processarPagamento(String metodoPagamento, Double valor) {
        System.out.println("Processando pagamento de $" + valor + " via " + metodoPagamento);
    }
}
