package Modul05.Liang;

import java.util.Scanner;

public class L6_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Integer value: ");
        if (input.hasNextLong()) {
            System.out.println("The sum of the digits is " + (sumDigits(input.nextLong())));
        }
    }

    public static int sumDigits(long n) {
        int result = 0;
        for (char val : Long.toString(n).toCharArray()) {
            result += Character.getNumericValue(val);
            //Alternatively
            //result += val - '0';
        }
        return result;
    }
}
