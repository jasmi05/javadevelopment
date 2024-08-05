import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(choices.length);
        return choices[index];
    }

    public static String getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String choice = scanner.nextLine().toLowerCase();
        while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
            System.out.print("Invalid choice. Enter rock, paper, or scissors: ");
            choice = scanner.nextLine().toLowerCase();
        }
        return choice;
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "You win!";
        } else {
            return "You lose!";
        }
    }

    public static void playGame(Scanner scanner) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        
        while (true) {
            String userChoice = getUserChoice(scanner);
            String computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            playGame(scanner);
        } finally {
            scanner.close();
        }
    }
}
