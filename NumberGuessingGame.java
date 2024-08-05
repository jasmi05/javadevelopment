import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int userGuess = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            
            if (userGuess < numberToGuess) {
                System.out.println("Higher!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Lower!");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
            }
        }
        
        scanner.close();
    }
}
