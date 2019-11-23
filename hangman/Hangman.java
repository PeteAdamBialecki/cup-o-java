
public class Hangman {
    public static void main(String[] args) {
        Game game = new Game("antidisestablishmentarianism");
        Prompter prompter = new Prompter(game);
        prompter.displayProgress();
        boolean isHit = prompter.promptForGuess();
        if (isHit) {
            System.out.println("Correct!");
        } else {
            System.out.println("Oops, wrong.");
        }
        prompter.displayProgress();
    }
}