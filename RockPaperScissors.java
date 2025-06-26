import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.nextLine().trim().toLowerCase();

        // Generate computer choice
        int randomIndex = random.nextInt(3);
        String computerChoice = choices[randomIndex].toLowerCase();

        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else if (
            userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")
        ) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid input. Please enter Rock, Paper, or Scissors.");
        }

        scanner.close();
    }
}