package com.peteadambialecki;

public class Shopkeeper extends Person {
    Shopkeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi, I'm a shopkeeper.";
    }

    void sellGoods() {
        // TODO
    }
}
