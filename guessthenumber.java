import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Random random = new Random();
         int rand=random.nextInt(100);        // Taking a computer generated random number
         int lowerBound=0;
         int upperBound=100;
        int attempts = 0;                          // Counting no of attempt
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I've picked a random number between " + lowerBound + " and " + upperBound + ".");
        
        while (!hasGuessedCorrectly) {          //Running this until the condition becoming true
            System.out.print("Enter your guess: ");
            int userGuess = Scanner.nextInt();
            
            attempts++;
            
            if (userGuess == rand) {
                hasGuessedCorrectly = true; 
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;                           //if this sastify then it will break this loop
            } else if (userGuess < rand) {
                System.out.println("Try again. Your guess is too low.");
            } else {
                System.out.println("Try again. Your guess is too high.");
            }
        }
        
    }
}

