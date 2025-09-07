/*Author: Kyle Klausen
 * Date: 09/07/25
 * Class: CSD-402
 * Description: This is a test for the program Fan.java */
public class TestFan {
    public static void main(String[] args) {
        // Fan using default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1 (default): " + fan1);

        // Fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        System.out.println("Fan 2 (custom): " + fan2);

        // Demonstrate setters
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("red");
        System.out.println("Fan 1 after updates: " + fan1);

        // Demonstrate getters
        System.out.println("Fan 2 color: " + fan2.getColor());
        System.out.println("Fan 2 radius: " + fan2.getRadius());
        System.out.println("Fan 2 speed: " + fan2.getSpeed());
        System.out.println("Fan 2 on? " + fan2.isOn());
    }
}