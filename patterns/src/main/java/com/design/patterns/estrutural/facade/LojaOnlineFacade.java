package com.design.patterns.estrutural.facade;

public class LojaOnlineFacade {

    private final ModuloPagamento moduloPagamento;
    private final ModuloInventario moduloInventario;
    private final ModuloEnvio moduloEnvio;

    public LojaOnlineFacade(){
        this.moduloPagamento = new ModuloPagamento();
        this.moduloInventario = new ModuloInventario();
        this.moduloEnvio = new ModuloEnvio();
    }

    public void comprarProduto(String produto, String metodoPagamento, Double valor, Integer quantidade, String endereco){
        moduloPagamento.processarPagamento(metodoPagamento, valor);
        moduloInventario.updateInventario(produto,quantidade);
        moduloEnvio.envioProduto(produto, endereco);
    }
}
