package com.peteadambialecki;

public class Main {

    public static void main(String[] args) {
	    List<String> ingredients = Arrays.asList(
	            "flour",
                "salt",
                "Baking powder",
                "butter",
                "eggs",
                "milk"
        );

//	    boolean hasEggs = false;
//	    for (String ingredient : ingredients) {
//	        if (ingredient.equals("eggs")) {
//	            hasEggs = true;
//	            break;
//            }
	    if (ingredients.contains("eggs")) {
            System.out.println("Sorry, this has eggs.");
        }
        }
    }
}
