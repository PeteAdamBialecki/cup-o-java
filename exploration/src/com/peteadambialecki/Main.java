package com.peteadambialecki;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Main {

    public static void yell(String words) {
        Objects.requireNonNull(words, () -> "Created issue" + Main.createIssue());
        System.out.printf("%s!!!!! %n", words.toUpperCase());
    }

    private static String createIssue() {
        System.out.println("Some external API call to a bug tracker");
        return "#ABC123";
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
        Main.yell(null);
    }
}