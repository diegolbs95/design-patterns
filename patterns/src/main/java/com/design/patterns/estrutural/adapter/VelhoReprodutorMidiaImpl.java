package com.design.patterns.estrutural.adapter;

public class VelhoReprodutorMidiaImpl implements VelhoReprodutorMidia {

    @Override
    public void iniciarAudio(String nomeArquivo) {
        System.out.println("Reproduzindo arquivo de audio: " + nomeArquivo);
    }
}