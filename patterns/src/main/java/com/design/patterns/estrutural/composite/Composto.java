package com.design.patterns.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composto implements Componente {

    private final List<Componente> componentes = new ArrayList<>();

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public void operacao() {
        componentes.forEach(Componente::operacao);
    }
}
