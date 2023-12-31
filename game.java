import java.util.Random;
import java.util.*;

public class game {
    public static void main(String[] args){
        int secretNumber, userGuess, attempts = 0;
        int maxAttempts = 10;
        int userScore = 0;
        boolean playAgain = true;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the guessing Game!");
        
        while(playAgain){
            secretNumber = random.nextInt(100) + 1;

            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts+ " attempts to guess it.");

            while(attempts < maxAttempts){
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();

                attempts++;

                if(userGuess == secretNumber){
                    System.out.println("Congratulations! You guessed the correct number.");
                    userScore++;
                    break;
                }
                else if(userGuess < secretNumber){
                    System.out.println("To low! Guess higher.");
                }
                else {
                    System.out.println("To high! Guess lower.");
                }

                System.out.println("Attemps remaing: " + (maxAttempts - attempts));
            }
            if(attempts == maxAttempts){
                System.out.println("Sorry, you used up all your attempts.");
                System.out.println("The secret number was: + secretNumber");
            }
            System.out.println("Your score: " + userScore);
            System.out.print("Do you want to play again? (y/n): ");
            String playAgainInput = scanner.next();

            if(!playAgainInput.equalsIgnoreCase("y")){
                playAgain = false;
            }
            attempts = 0;
        }

        System.out.println("Thank you for playing the Guessing Game!!! ");
    }
}