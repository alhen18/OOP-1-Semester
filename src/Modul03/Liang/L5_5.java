package Modul03.Liang;

public class L5_5 {

    public static void main(String[] args) {

        float cel;
        float fahr;

        // Display header for table
        System.out.println("Celsius      Fahrenheite");

        // Display table
        for (cel = 0; cel <= 200; cel += 2) {
            fahr = (cel * 9 / 5) + 32;
            System.out.println(cel + "      " + "     " + fahr);
        }

        System.out.println("Fahrenheite     Celsius");

        for (fahr = 20; fahr <= 270; fahr += 5) {
            cel = (float) ((fahr - 32) / 1.8);
            System.out.println(fahr + "    " + "    " + cel);
        }

    }
}
