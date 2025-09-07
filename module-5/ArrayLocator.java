//*Author: Kyle Klausen
//Class: CSD-402
//Date: 09/05/25
//Description: This Java program locates the largest and smallest elements in 2D arrays, returning their row and column positions accurately. */
public class ArrayLocator {

    // Locate largest in double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate largest in int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest in double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest in int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Example test
    public static void main(String[] args) {
        double[][] doubleArray = {{1.5, 2.2}, {3.7, 0.5}};
        int[][] intArray = {{5, 8}, {1, 9}};

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest in double array: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest in double array: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
        System.out.println("Largest in int array: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest in int array: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
    }
}