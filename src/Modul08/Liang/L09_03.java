package Modul08.Liang;

import java.util.Date;

/**
 *
 * @author Aleksander Henriksen
 */
public class L09_03 {

    public static void main(String[] args) {

        /**
         * Create a new Date objekt. Setting the date to some timestamps after
         * Jan 1 1970.
         */
//        Date date = new Date(10000);
//
        // Printing out the date for the time.
//        System.out.println(date.toString());

//        Date date1 = new Date(100000);
//        System.out.println(date1.toString());

//        Date date2 = new Date(1000000);
//        System.out.println(date2.toString());

//        Date date3 = new Date(10000000);
//        System.out.println(date3.toString());

//        Date date4 = new Date(100000000);
//        System.out.println(date4.toString());

//        Date date5 = new Date(1000000000);
//        System.out.println(date5.toString());

//        Date date6 = new Date(10000000000l);
//        System.out.println(date6.toString());

//        Date date7 = new Date(100000000000l);
//        System.out.println(date7.toString());


        // Create a new Date Object.
        Date date = new Date();

        // Create a long array and initialize it with the values.
        long[] Times = {10000, 100000, 1000000, 10000000, 100000000,
            1000000000, 10000000000L, 100000000000L};

        // Loop the long array using an for each loop.
        for (long Time : Times) {
            // Set the elapsed time of the Date Object.
            date.setTime(Time);

            // Print the elapsed time and the string value of the date object.
            System.out.println("The date after " + Time + " is "
                    + date.toString());
        }
    }
}
