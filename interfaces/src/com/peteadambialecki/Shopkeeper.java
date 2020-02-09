package com.peteadambialecki;

public class Shopkeeper extends Person implements Seller {
    Shopkeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi, I'm a shopkeeper.";
    }

    @Override
    public void sellGoods() {
        // TODO
    }
}
