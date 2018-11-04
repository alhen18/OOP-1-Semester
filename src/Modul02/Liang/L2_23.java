package Modul02.Liang;

import java.util.Scanner;

public class L2_23 {

    public static void main(String[] args) {

        // Create a Scanner objekt.
        Scanner input = new Scanner(System.in);

        // Print out a bar to type info.
        System.out.print("Enter the driveing distance: ");
        double distance = input.nextDouble();

        // Print out a bar to type info.
        System.out.print("Enter miles per gallon: ");
        double miles = input.nextDouble();

        // Print out a bar to type info.
        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();

        // Set to calulate the cost of the trip.
        double cost;
        cost = (distance / miles) * price;

        // Print out the cost for the trip.
        System.out.println("The cost of driving is $ " + cost);

    }
}
