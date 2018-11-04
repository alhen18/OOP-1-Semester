package Modul05.Liang;

import java.util.Scanner;

public class L6_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        if (input.hasNextInt()) {
            System.out.printf("The input is%s a palindrome%n", (isPalindrome(input.nextInt())) ? "" : " not");
        }
    }

    public static boolean isPalindrome(int number) {
        boolean result = false;
        if (number == reverse(number)) {
            result = true;
        }
        return result;
    }

    public static int reverse(int number) {
        int result = 0;
        char[] numberInput = Integer.toString(number).toCharArray();
        char[] numberOutput = new char[numberInput.length];
        String numberOutputString = "";
        for (int i = 0; i < numberOutput.length; i++) {
            numberOutput[i] = numberInput[numberInput.length - i - 1];
        }
        for (char x : numberOutput) {
            numberOutputString += x;
        }
        result = Integer.parseInt(numberOutputString);
        return result;
    }
}
