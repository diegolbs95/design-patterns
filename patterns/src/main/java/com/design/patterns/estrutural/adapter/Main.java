package com.design.patterns.estrutural.adapter;

public class Main {

    public static void main(String[] args) {

        var reprodutorAntigo = new VelhoReprodutorMidiaImpl();

        var adapter = new NovoReprodutorAdapter(reprodutorAntigo);

        adapter.iniciar("musica.mp4");
    }
}
