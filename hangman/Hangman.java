
public class Hangman {
    public static void main(String[] args) {
        Game game = new Game("antidisestablishmentarianism");
        Prompter prompter = new Prompter(game);
        prompter.displayProgress();
        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.promptForGuess();
            prompter.displayProgress();
        }
        prompter.displayOutcome();
    }
}