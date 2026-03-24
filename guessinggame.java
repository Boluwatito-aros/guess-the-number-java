package games;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println();

        // Difficulty selection
        System.out.println("Select a difficulty:");
        System.out.println("  1. Easy   (1 - 50,  10 attempts)");
        System.out.println("  2. Medium (1 - 100, 7 attempts)");
        System.out.println("  3. Hard   (1 - 500, 5 attempts)");
        System.out.println();
        System.out.print("Enter your choice (1/2/3): ");

        int choice = scanner.nextInt();
        int range;
        int maxAttempts;

        if (choice == 1) {
            range = 50;
            maxAttempts = 10;
        } else if (choice == 3) {
            range = 500;
            maxAttempts = 5;
        } else {
            range = 100;  // Default to Medium for invalid input
            maxAttempts = 7;
        }

        int targetNumber = random.nextInt(range) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println();
        System.out.println("I have selected a number between 1 and " + range + ".");
        System.out.println("You have " + maxAttempts + " attempts. Good luck!");

        do {
            System.out.println();
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > range) {
                // Input validation
                System.out.println("Please enter a number between 1 and " + range + ".");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            } else {
                System.out.println();
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempt(s)!");
            }

        } while (guess != targetNumber && attempts < maxAttempts);

        // Ran out of attempts
        if (guess != targetNumber) {
            System.out.println();
            System.out.println("Game over! The number was " + targetNumber + ". Better luck next time!");
        }

        scanner.close();
    }
}