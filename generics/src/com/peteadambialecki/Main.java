package com.peteadambialecki;

public class Main {

    public static void main(String[] args) {
        Milk milk = new Milk();
        Oranges oranges = new Oranges();

        Box boxOfMilk = new Box();
        Box boxOfOranges = new Box();

        boxOfMilk.add(milk);
        boxOfOranges.add(oranges);
        ((Milk)boxOfMilk.remove()).drink();
        ((Oranges)boxOfOranges.remove()).juggle();
    }
}
