package com.peteadambialecki;

public class Main {

    public static void main(String[] args) {
        // Create Objects
        Shopkeeper shopKeeper = new Shopkeeper("Larry");
        Teacup teacup = new Teacup();
        String treehouse = "Treehouse";

        // Loop through Objects
        Object[] objects = {shopKeeper, teacup, treehouse};

        for (Object object : objects) {
            if (object instanceof Chatable) {
                String response = ((Chatable) object).chat();
                System.out.println(response);
            }
        }

        // Loop through Chatables
        Chatable[] chatables = {shopKeeper, teacup};

        for (Chatable chatable : chatables) {
            String response = chatable.chat();
            System.out.println(response);
        }
    }
}
