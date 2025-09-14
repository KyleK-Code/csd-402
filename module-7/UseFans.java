/* Author: Kyle Klausen
 * Date: 09/14/25
 * Class: CSD-402
 * Assignment: 7_2
 * Description: This class demonstrates creating a collection of Fan instances and displaying them without using toString()
 */

import java.util.ArrayList;

public class UseFans {

    // Method to display a single Fan instance
    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan is ON");
            System.out.println("Speed: " + fan.getSpeed());
        } else {
            System.out.println("Fan is OFF");
        }
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("---------------------------");
    }

    // Method to display a collection of Fan instances
    public static void displayFans(ArrayList<Fan> fans) {
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1) + ":");
            displayFan(fans.get(i));
        }
    }

    // Main method to test
    public static void main(String[] args) {
        ArrayList<Fan> fanList = new ArrayList<>();

        // Create some fans
        Fan fan1 = new Fan(); // default fan
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8, "red");

        // Add fans to the collection
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display all fans
        System.out.println("Displaying all fans in the collection:");
        displayFans(fanList);

        // Display a single fan
        System.out.println("Displaying a single fan (fan2):");
        displayFan(fan2);
    }
}