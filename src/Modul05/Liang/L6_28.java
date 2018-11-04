package Modul05.Liang;

import java.util.Scanner;

public class L6_28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer value: "); // requesting user input
            if (input.hasNextInt()) { // if the user inputs a valid number
                int[] primesCandidates = mersennePrime(input.nextInt()); //request mersenne primes and creates an array to store them
                System.out.println("A list of mersenne primes and their p value"); //prints headline
                System.out.printf("%-20s%-20s%n", "p", "2^p – 1"); // prints explanatory line
                System.out.println("________________________________________"); //Seperator line
                for (int x : primesCandidates) {//Loops thru all primes returned from the mersennePrime method
                    System.out.printf("%-20d%-20d%n", x, (long) (Math.pow(2, x) - 1)); // creates a line in the table and prints it
                }

                break; //breakes out of the task
            } else {
                input.next(); // clears the input and continues
            }
        }
    }

    public static int[] mersennePrime(int n) {
        //Returns array containing testet p values resulting in a prime

        boolean[] tests = new boolean[n]; //Contains whether or not an index + 2 contains a mersenne prime candidate
        int numberOfPrimes = 0; //Describes how many prime candidates were found

        for (int i = 2; i <= n; i++) { //Looping thru all possible candidates within the limit
            long testedPrime = (long) Math.pow(2, i) - 1; //Indicates the mersenne prime to be tested
            if (isPrime(testedPrime) == true) { // if no devisor is found indicate that this is a true mersenne prime candidate
                tests[i - 2] = true;
                numberOfPrimes++; // increment the number of primes found
            }
        }

        int[] result = new int[numberOfPrimes]; //Declaring the results array

        for (int i = 0; i < result.length; i++) { //looping thru the results array
            for (int j = 0; j < tests.length; j++) {//looping thru the tests array
                if (tests[j] == true) {// if the test resulted in a true mersenne prime
                    tests[j] = false; // remove said prime from the list
                    result[i] = j + 2; // add the index of test + 2( to give the mersenne prime candidate) to the results list
                    break; // break loop so as not to override
                }
            }
        }
        return result;
    }

    public static boolean isPrime(long candidate) {
        boolean result = true;
        for (int i = 2; i < Math.sqrt(candidate); i++) {
            if (candidate % i == 0) {
                result = false;
                break;

            }
        }
        return result;
    }
}
