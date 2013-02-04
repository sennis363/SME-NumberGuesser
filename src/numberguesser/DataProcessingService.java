package numberguesser;

/**
 *
 * @author Sean Ennis
 */
public class DataProcessingService {
    private int attempts = 0;
    private int wins = 0;
    private int guess = 0;

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }
    
    //public NumberGuessResult checkGuess(String guess) {
        //return guess;
    //}
}
