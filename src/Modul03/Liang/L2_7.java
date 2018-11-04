package Modul03.Liang;

import java.util.Scanner;

public class L2_7 {

    public static void main(String[] args) {

        // Create a Scanner object.
        Scanner input = new Scanner(System.in);

        // Print out a bar to type in info.
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        // Set a int that calculate the years.
        int year = minutes / 525600;
        // Set a int that take the rest of the minutes after calculating the years.
        int day = year % 365;

        // Print out the result.
        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days");
    }
}
