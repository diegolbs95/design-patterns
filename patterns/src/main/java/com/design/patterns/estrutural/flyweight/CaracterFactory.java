package com.design.patterns.estrutural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {

    private final Map<Character, CaracterImpl> caracteres = new HashMap<>();

    public Caracter getCaracter(char simbolo) {
        if (!caracteres.containsKey(simbolo)){
            caracteres.put(simbolo, new CaracterImpl(simbolo));
        }
        return caracteres.get(simbolo);
    }
}