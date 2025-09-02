/**
 * File: ArrayAverageTest.java
 * Author: Kyle Klausen
 * Date: 8/30/25
 * Description: Demonstrates four overloaded methods to calculate the average
 *              of arrays of different numeric types (short, int, long, double).
 *              Each method returns the average as the same type as the array.
 */

import java.util.Arrays;

public class ArrayAverageTest {
    
    // Method to calculate average of short array
    public static short average(short[] array) {
        int sum = 0; // use int to avoid overflow
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate average of int array
    public static int average(int[] array) {
        long sum = 0; // use long to avoid overflow
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Method to calculate average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Different sized arrays
        short[] shortArray = {2, 4, 6};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Display short array and average
        System.out.println("Short array: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        // Display int array and average
        System.out.println("Int array: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));
        System.out.println();

        // Display long array and average
        System.out.println("Long array: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));
        System.out.println();

        // Display double array and average
        System.out.println("Double array: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
        System.out.println();
    }
}