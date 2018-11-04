package Modul04.Liang;

import java.util.Scanner;

public class L7_3 {

    public static void main(String[] args) {
        //Initaiate object instances
        Scanner input = new Scanner(System.in);

        //Define variables
        int userInput;
        int[] count = new int [10];
        //Request user input
//        System.out.println("Enter a list on numbers lower then 15 but still greater then 0 below here.");
//        System.out.print("Enter list here: ");
//        while (true) {
//            if (input.hasNextInt()) {
//                userInput = input.nextInt();
//                if (userInput != 0) {
//                    count[userInput - 1] += 1;
//                } else {
//                    break;
//                }
//            }
//        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.printf("[%d] Occurs %d times%n", (i + 1), count[i]);
            }
        }
    }

}
