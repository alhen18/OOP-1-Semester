package Modul08.Liang;

import java.util.Date;

/**
 *
 * @author Aleksander Henriksen
 */
public class Fan {
    
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this(SLOW, true, 5, "Blue");
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return this.on ? "Speed is " + this.speed + ", Color is " + this.color 
                + ", Radius is " + this.radius + "." : "Color is " + this.color 
                + ", Radius is " + this.radius + ". Fan is off.";
    }
    
      public String toString(Date date) {
        return date.toString() + ": " + this.toString();
    }
    
     public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
