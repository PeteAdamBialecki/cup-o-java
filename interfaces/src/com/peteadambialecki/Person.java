package com.peteadambialecki;

public class Person implements Chatable {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String chat() {
        return "Hey there...";
    }
}
