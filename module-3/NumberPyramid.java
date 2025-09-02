/**
 * File: NumberPyramid.java
 * Author: Kyle Klausen
 * Date: 8/29/25
 * Description: This program prints a pyramid pattern of numbers where each row
 *              doubles numbers to the midpoint and then mirrors them back,
 *              followed by an '@' symbol aligned to the right.
 */

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 7; // number of rows

        // First, calculate the width of the last row (for '@' alignment)
        int maxWidth = 0;
        for (int i = 0; i < rows; i++) {
            int width = 0;
            // Leading spaces
            width += (rows - i - 1) * 2;
            // Numbers on left
            int num = 1;
            for (int j = 0; j <= i; j++) {
                width += (num + " ").length();
                num *= 2;
            }
            // Numbers on right (mirrored)
            num /= 4;
            for (int j = 0; j < i; j++) {
                width += (num + " ").length();
                num /= 2;
            }
            maxWidth = Math.max(maxWidth, width);
        }

        // Now print each row
        for (int i = 0; i < rows; i++) {
            StringBuilder row = new StringBuilder();

            // Leading spaces
            for (int s = 0; s < rows - i - 1; s++) {
                row.append("  ");
            }

            // Left side numbers
            int num = 1;
            for (int j = 0; j <= i; j++) {
                row.append(num).append(" ");
                num *= 2;
            }

            // Right side numbers (mirrored)
            num /= 4;
            for (int j = 0; j < i; j++) {
                row.append(num).append(" ");
                num /= 2;
            }

            // Add spaces to align '@' vertically
            int spacesNeeded = maxWidth - row.length();
            for (int s = 0; s < spacesNeeded; s++) {
                row.append(" ");
            }

            // Add '@' symbol
            row.append("@");

            System.out.println(row);
        }
    }
}
