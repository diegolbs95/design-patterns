package com.design.patterns.criacional.singleton;

import java.util.Objects;

public class Singleton {

    private static Singleton instancia;

    private Singleton(){}

    // Método estático público para obter a instância única da classe
    public static Singleton getInstancia(){
        if (Objects.isNull(instancia)) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
