
public class Hangman {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Hangman <answer>");
            System.err.println("answer is required");
            System.exit(1);
        }
        Game game = new Game(args[0]);
        Prompter prompter = new Prompter(game);
        prompter.displayProgress();
        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.promptForGuess();
            prompter.displayProgress();
        }
        prompter.displayOutcome();
    }
}