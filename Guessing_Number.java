package task;

import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        System.out.println("Welcome to the Guessing Game!");

        do {
            int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int numberOfAttempts = 0;
            int userGuess = 0;
            playAgain = false;

            System.out.println("I have selected a random number between 1 and 100.");
            System.out.println("Try to guess it!");

            // Loop until the user guesses the correct number
            while (userGuess != randomNumber) {

                // Input validation for integer and range
                while (true) {
                    try {
                        System.out.println("Enter your guess (between 1 and 100):");
                        userGuess = input.nextInt();

                        if (userGuess < 1 || userGuess > 100) {
                            System.out.println("Invalid input! Please enter a number between 1 and 100.");
                        } else {
                            break; // Valid input, break out of the loop
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please enter a valid integer.");
                        input.next(); // Clear the invalid input
                    }
                }

                numberOfAttempts++;

                if (randomNumber > userGuess) {
                    System.out.println("Too low! Try again.");
                } else if (randomNumber < userGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number.");
                    System.out.println("It took you " + numberOfAttempts + " attempts.");
                }
            }

            // Ask if the user wants to play again
            System.out.println("Would you like to play again? (yes/no)");
            String response = input.next().toLowerCase();

            if (response.equals("yes")) {
                playAgain = true; // Restart the game
            } else {
                System.out.println("Thanks for playing! Goodbye.");
            }

        } while (playAgain);

        // Close the scanner
        input.close();
    }
}
