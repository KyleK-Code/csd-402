/*
 * Author: Kyle Klausen
 * Course: CSD-402
 * Module: M9
 * Date: 09/21/2025
 * Description:
 * This program stores at least 10 Strings in an ArrayList, displays them
 * using a for-each loop, then asks the user which element they would like
 * to see again. The element is retrieved inside a try/catch block to handle
 * invalid indices. If an invalid index is given, "Out of Bounds" is displayed.
 * Demonstrates autoboxing/auto-unboxing with Integer conversions from String input.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class KyleArrayListStrings {

    public static void main(String[] args) {
        // Create ArrayList with 10+ Strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");
        words.add("Elderberry");
        words.add("Fig");
        words.add("Grape");
        words.add("Honeydew");
        words.add("Kiwi");
        words.add("Lemon");

        // Display elements using for-each loop
        System.out.println("ArrayList contents:");
        for (String word : words) {
            System.out.println(word);
        }

        // Ask user for which element to display again
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0-" + (words.size() - 1) + ") of the element to view again: ");
        String userInput = scanner.nextLine();

        try {
            // Demonstrating autoboxing/unboxing (String → Integer → int)
            Integer index = Integer.valueOf(userInput);  // Autoboxing
            int idx = index;                            // Auto-unboxing

            System.out.println("You selected: " + words.get(idx));
        } catch (Exception e) {
            System.out.println("Exception thrown: Out of Bounds");
        }
    }
}