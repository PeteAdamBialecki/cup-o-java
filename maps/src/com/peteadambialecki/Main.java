package com.peteadambialecki;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put("breakfast", "waffles");
        meals.put("lunch", "gyros");
        meals.put("dinner", "enchiladas");

        System.out.println(meals);
    }
}
