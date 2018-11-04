package Modul05.Opgaver;

public class D5 {

    public static void main(String[] args) {

        System.out.println("The Primes between 100 and 200 is: ");
        printPrimeNumbers();
    }

    public static void printPrimeNumbers() {

        final int NUMBERS_OF_PRIMES_PER_LINE = 6;
        int count = 0;
        int number = 100;

        while (count < 21) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBERS_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
