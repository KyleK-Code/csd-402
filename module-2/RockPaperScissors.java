/* Author: Kyle Klausen
 * Date: 08/23/25
 * Assignment: CSD402 - Module 2.2
 */

import java.util.Random;
import java.util.Scanner;

/**
 * A simple Rock-Paper-Scissors game against the computer.
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);
        // Create a Random object to generate the computer's selection.
        Random random = new Random();

        // The program will generate a random number (1, 2, or 3) for the computer's choice.
        // 1 = Rock, 2 = Paper, 3 = Scissors
        int computerChoice = random.nextInt(3) + 1;

        // Prompt the user for their selection.
        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        
        // Read the user's input as an integer.
        int userChoice = scanner.nextInt();

        // Close the scanner to prevent resource leaks.
        scanner.close();

        // Convert the integer choices to their corresponding string names for display.
        String computerMove = "";
        switch (computerChoice) {
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
        }

        String userMove = "";
        switch (userChoice) {
            case 1:
                userMove = "Rock";
                break;
            case 2:
                userMove = "Paper";
                break;
            case 3:
                userMove = "Scissors";
                break;
            default:
                // Handle invalid user input.
                System.out.println("\nInvalid choice. Please run the program again and enter 1, 2, or 3.");
                return; // Exit the program if the input is invalid.
        }

        // Display the selections made by both the computer and the user.
        System.out.println("\nComputer chose: " + computerMove);
        System.out.println("You chose: " + userMove);

        // Determine the winner and display the result.
        if (computerChoice == userChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || // Rock beats Scissors
                   (userChoice == 2 && computerChoice == 1) || // Paper beats Rock
                   (userChoice == 3 && computerChoice == 2)) { // Scissors beats Paper
            System.out.println("You win!");
        } else {
            // The user didn't win, so the computer must have.
            System.out.println("You lose! The computer wins.");
        }
    }
}
