package com.peteadambialecki;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void yell(String words) {
        System.out.printf("%s!!!!! %n", words.toUpperCase());
    }

    public static void main(String[] args) {
	    List<String> ingredients = Arrays.asList(
	            "flour",
                "salt",
                "Baking powder",
                "butter",
                "eggs",
                "milk"
        );

	    Main.yell("But I want the cake");
        ingredients.forEach(System.out::println);
        ingredients.forEach(Main::yell);
    }
}