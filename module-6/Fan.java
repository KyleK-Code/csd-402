/*Author: Kyle Klausen
 * Date: 09/07/25
 * Class: CSD-402
 * Description: This program defines a Fan class with speed, radius, color, and on/off state. It includes constructors, getters, setters, and a toString() method to display fan details.
 */
public class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor (default values)
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // toString() method
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON, speed: " + speed + ", radius: " + radius + ", color: " + color;
        } else {
            return "Fan is OFF, radius: " + radius + ", color: " + color;
        }
    }
}