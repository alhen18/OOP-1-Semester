package Modul02.Liang;

import java.util.Scanner;

public class L2_1 {

    public static void main(String[] args) {

        // Create a Scanner objekt.
        Scanner input = new Scanner(System.in);

        // Print out a bar to enter miles to convert.
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        // Maked a calulator to convert miles to kilometers.
        double result;
        result = miles * 1.6;

        // Round down the result to only show a few dicimals.
        float round;
        round = Math.round(result * 100f)/100f;

        // Print out the result.
        System.out.println(miles + " miles is " + round + " kilometers");

    }
}
