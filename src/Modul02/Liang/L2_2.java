package Modul02.Liang;

import java.util.Scanner;

public class L2_2 {

    public static void main(String[] args) {

        // Create a Scanner object.
        Scanner input = new Scanner(System.in);

        // Print a bar to enter the info of a length.
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double length = input.nextDouble();

        // set a variable for the area.
        double area;
        area = (Math.sqrt(3)/4) * Math.pow(length, 2);
        // Print out the area.
        System.out.println("This area is " + area);

        // Set a variable for the volume.
        double volume;
        volume = area * length;
        // Print out the volume.
        System.out.println("The volume og the Triangular prism is " + volume);

    }

}
