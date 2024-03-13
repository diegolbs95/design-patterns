package com.design.patterns.criacional.prototype;

public class PrototypeConcreto2 implements Prototype{
    @Override
    public Prototype clonar() {
        return new PrototypeConcreto2();
    }

    @Override
    public String toString() {
        return "PrototypeConcreto2";
    }
}
