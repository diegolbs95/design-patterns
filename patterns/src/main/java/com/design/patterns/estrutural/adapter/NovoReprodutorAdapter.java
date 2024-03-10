package com.design.patterns.estrutural.adapter;


public class NovoReprodutorAdapter implements NovoReprodutorMidia {

    private VelhoReprodutorMidia velhoReprodutorMidia;

    public NovoReprodutorAdapter(VelhoReprodutorMidia velhoReprodutor) {
        this.velhoReprodutorMidia = velhoReprodutor;
    }

    @Override
    public void iniciar(String nomeArquivo) {
        velhoReprodutorMidia.iniciarAudio(nomeArquivo);
    }
}