package Modul03.Liang;

public class L5_7 {

    public static void main(String[] args) {

        int tuition = 10000;
        int year;
        year = 0;

        System.out.println("The tuition after " + year + " is " + tuition);

        for (year = 1; year <= 10; year++) {
            tuition = (int) (tuition * 1.06);
            System.out.println("The tuition after " + year + " is " + tuition);
        }

        for (year = 14; year < 15; year++) {
            tuition = (int) ((tuition * 1.06) - 10000);
            System.out.println("The tuition total cost after " + year + " is " + tuition);
        }
    }
}
