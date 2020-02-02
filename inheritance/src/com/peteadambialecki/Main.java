package com.peteadambialecki;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

class Animal {
    String sound = "";

    Animal(String sound) {
        this.sound = sound;
    }

    void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": sound = " + sound;
    }
}

class Dog extends Animal {
    Dog() {
        super( sound: "bark");
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("wags tail");
    }
}

class DogFood {

}