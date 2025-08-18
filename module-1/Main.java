// Author: Kyle Klausen
// Date: August 17, 2025
// Assignment: Water Energy Calculator
// Purpose: This program calculates the energy required to heat a given mass of water
// from an initial to a final temperature.

import java.util.Scanner;

/**
 * This program calculates the energy needed to heat a specified amount of water
 * based on user inputs for mass and temperature.
 */
public class Main {

    /**
     * The main method prompts the user for inputs, performs the calculation,
     * and displays the result.
     */
    public static void main(String[] args) {
        // Use Scanner to get input from the user.
        Scanner input = new Scanner(System.in);

        // --- SECTION: USER INPUT ---
        // Prompt for and read the water mass, initial temperature, and final temperature.
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // --- SECTION: CALCULATION ---
        // Calculate the energy (Q) using the specific heat capacity of water.
        double energyNeeded = waterMass * (finalTemperature - initialTemperature) * 4184;

        // --- SECTION: OUTPUT ---
        // Display the final energy value formatted to two decimal places.
        System.out.printf("The energy needed to heat the water is %.2f Joules.\n", energyNeeded);

        // Close the scanner to free up resources.
        input.close();
    }
}
