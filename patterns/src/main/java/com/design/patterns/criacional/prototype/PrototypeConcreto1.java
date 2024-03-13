package com.design.patterns.criacional.prototype;

public class PrototypeConcreto1 implements Prototype{
    @Override
    public Prototype clonar() {
        return new PrototypeConcreto1();
    }

    @Override
    public String toString() {
        return "PrototypeConcreto1";
    }
}
