import java.io.Console;

public class Introductions {
    public static void main(String[] args) {
        Console console = System.console();
        String firstName = console.readLine("What is your name?  ");
        console.printf("Hey, my name is %s...\n", firstName);
        console.printf("%s is looking to learn more.\n", firstName);
    }
}