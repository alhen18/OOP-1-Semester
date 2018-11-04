package Modul02.Liang;

import java.util.Scanner;

public class L2_7 {

    public static void main(String[] args) {

        // Create a Scanner objekt.
        Scanner input = new Scanner(System.in);

        // Print out a bar to type in info.
        System.out.print("Enter the number og minutes: ");
        int minutes = input.nextInt();

        // Set a int that calulate the years.
        int year = minutes / 525600;
        // Set a int that take the rest of the minutes after calulating the years.
        int day = year % 365;

        // Print out the result.
        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days");
    }
}
