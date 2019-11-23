
public class Hangman {
    public static void main(String[] args) {
        Game game = new Game("test");
        Prompter prompter = new Prompter(game);
        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("Correct!");
        } else {
            System.out.println("Oops, wrong.");
        }
    }
}