package Modul2.Liang;

import java.util.Scanner;

public class L2_6 {

    public static void main(String[] args) {

        // Set Scanner to input.
        Scanner input = new Scanner(System.in);

        //
        System.out.print("Input any number: ");
        //
        int number = input.nextInt();

        // Modulus of the number the user inputted by 10.
        int modulus = number % 10;

        // divided the number the user inputted by 10.
        int divide = number / 10;

        // divided the number the user inputted by 100.
        int first = number / 100;

        // divided the number left from the divided input by 10.
        int middel = divide % 10;

        if (number > 100) {
            // multiply number to get the result.
            int sum = first * middel * modulus;

            // print out the result.
            System.out.println("" + sum);
        } else {
            int sum = middel * modulus;
            System.out.println("" + sum);

        }
    }
}
