package games;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int targetNumber = random.nextInt(100) + 1; // target number between 1 and 100
		int guess;
		int attempts = 0;
		
		System.out.println("Welcome to the Guess the Number game!");
		System.out.println(" ");
		System.out.println("I have selected a number between 1 and 100. Try to guess it.");
		
		do {
			System.out.println(" ");
			System.out.print("Enter your guess: ");
			guess = scanner.nextInt();
			attempts++;
			
			
			if (guess < targetNumber) {
				System.out.println("Too low! Try again");
			}
			else if (guess > targetNumber) {
				System.out.println("Too high! Try again");
			}
			else {
				System.out.println(" ");
				System.out.println("Congratulations! You guessed the number in " + attempts + " attempts");
			}
		}
		while(guess != targetNumber);
		
		scanner.close();

	}

}
