package Modul03.Opgaver;

import java.util.Scanner;

public class B4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of the month: ");
        int mouth = input.nextInt();

        switch (mouth % 13) {
            case 1:
                System.out.println("January have 31 days");
                break;
            case 2:
                System.out.println("February have 28 days");
                break;
            case 3:
                System.out.println("March have 31 days");
                break;
            case 4:
                System.out.println("April have 30 days");
                break;
            case 5:
                System.out.println("May have 31 days");
                break;
            case 6:
                System.out.println("June have 30 days");
                break;
            case 7:
                System.out.println("July have 31 days");
                break;
            case 8:
                System.out.println("August have 31 days");
                break;
            case 9:
                System.out.println("September have 30 days");
                break;
            case 10:
                System.out.println("October have 31 days");
                break;
            case 11:
                System.out.println("November have 30 days");
                break;
            case 12:
                System.out.println("December have 31 days");
                break;
            default:
                System.err.println("It's not a mouth og the year");
        }
    }
}
