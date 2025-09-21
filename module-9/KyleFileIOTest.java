/*
 * Author: Kyle Klausen
 * Course: CSD-402
 * Module: M9
 * Date: 09/21/2025
 * Description:
 * This program creates (if not existing) or appends to a file named "data.file".
 * It writes 10 randomly generated integers separated by spaces. Then, it reopens
 * the file, reads the data, and displays it to the user.
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class KyleFileIOTest {

    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        // Write or append 10 random numbers to file
        try (FileWriter writer = new FileWriter(file, true)) {
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100); // random 0–99
                writer.write(num + " ");
            }
            writer.write("\n"); // add a newline for readability
            System.out.println("10 random numbers written to data.file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read and display file contents
        System.out.println("\nContents of data.file:");
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}