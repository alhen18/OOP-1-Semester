package Modul15.Liang;

import java.util.Scanner;

public class liang12_2 {

    private static Scanner input;

    private static final String[] MONTHS = {"January", "Febuary", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};
    private static final int[] DOM = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void print() {

        input = new Scanner(System.in);

        System.out.print("please input a integer between 1 and 12:  ");
        int monthIndex = input.nextInt() - 1;

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
