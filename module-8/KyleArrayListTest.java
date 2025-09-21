/*
 * Author: Kyle Klausen
 * Course: CSD-402
 * Assignment: M8
 * Date: 09/20/2025
 * Description:
 * This program accepts integer input from the user, stores the values
 * into an ArrayList, and then calls a method to determine the largest
 * value in the list. The program terminates input when 0 is entered,
 * but 0 is also stored in the ArrayList. If the ArrayList is empty,
 * the max method returns 0.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class KyleArrayListTest {

    // Method to return the largest value in an ArrayList of Integers
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0; // return 0 if the ArrayList is empty
        }

        Integer largest = list.get(0);
        for (Integer number : list) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop, 0 will also be stored):");
        while (true) {
            int input = scanner.nextInt();
            numbers.add(input); // Always add the input
            if (input == 0) {
                break; // Stop collecting input once 0 is entered
            }
        }

        // Call the max method and display the result
        Integer largestValue = max(numbers);
        System.out.println("The largest value in the ArrayList is: " + largestValue);
    }
}