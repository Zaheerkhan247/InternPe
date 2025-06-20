import java.util.Scanner;
import java.util.Random;

 class GuessTheNumber {
    public static void main(String[] args) {
        // Create a Scanner for input and Random for generating the number
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

        // Loop until the user guesses the correct number
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();  // Take user's guess
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close(); // Close the scanner
    }
}