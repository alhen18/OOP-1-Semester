package Modul05.Liang;

import java.util.Scanner;

public class L6_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        if (input.hasNextLong()) {
            System.out.println("The square root is " + sqrt(input.nextLong()));
        }
    }

    public static double sqrt(long n) {

        double result = 0;
        double lastGuess = n;
        double nextGuess = n;

        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) / 2;
            //System.out.printf("lastGuess: %.5f nextGuess: %.5f%n",lastGuess, nextGuess);
        } while (Math.abs(nextGuess - lastGuess) > 0.0000000000001);

        result = lastGuess;

        return result;
    }
}
