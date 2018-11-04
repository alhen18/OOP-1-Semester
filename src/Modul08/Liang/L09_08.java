package Modul08.Liang;

import java.util.Date;

/**
 *
 * @author Aleksander Henriksen
 */
public class L09_08 {
    
    public static void main(String[] args) {
        
        // Create a Fan with Speed, Radius, Color and and On/Off switch.
        Fan fan1 = new Fan();
            fan1.setSpeed(Fan.FAST);
            fan1.setRadius(10);
            fan1.setColor("Red");
            fan1.setOn(true);
        
        // Create a Fan with Speed.
        Fan fan2 = new Fan();
            fan2.setSpeed(Fan.SLOW);
            
            // Print out the 2 created fans.
            System.out.println("Fan1 >> " + fan1.toString());
            System.out.println("Fan2 >> " + fan2.toString());
            
        // Calling a Fan by Speed, On/Off switch, Radius and color.
        Fan fan3 = new Fan(Fan.MEDIUM, true, 15, "Purple");
            // Print out the 3th fan.
            System.out.println("Fan3 >> " + fan3.toString(new Date()));
    }
}
