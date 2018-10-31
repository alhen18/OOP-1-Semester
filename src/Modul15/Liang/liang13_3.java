package Modul15.Liang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class liang13_3 {

    private static final String[] MONTHS = {"January", "Febuary", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
    private static final int[] DOM = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void print() {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a integer between 1 and 12: ");
        int monthIndex = -1;

        try {
            monthIndex = input.nextInt() - 1;
        } catch (InputMismatchException ie) {
            input.next();
            System.out.println("The value have to be a Integer. Please try again.");
            print();
        }

        try {
            System.out.println(MONTHS[monthIndex] + " has " + DOM[monthIndex] + " days.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value has to be between 1 and 12. Please try again...");
            print();
        }

    }

    public static void main(String[] args) {
        print();
    }
}
