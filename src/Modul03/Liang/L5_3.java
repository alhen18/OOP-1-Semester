package Modul03.Liang;

public class L5_3 {

    public static void main(String[] args) {

        double cel;

        // Display header for table
        System.out.println("Celsius      Fahrenheit");

        // Display table
        for (cel = 0; cel <= 200; cel += 2) {
            double fahr = (cel * 9 / 5) + 32;
            System.out.println(cel + "      " + "     " + fahr);

        }
    }
}
