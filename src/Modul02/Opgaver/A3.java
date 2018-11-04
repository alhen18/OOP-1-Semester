package Modul02.Opgaver;

public class A3 {

    public static void main(String[] args) {

        // Set a varibale for each day.
        double Monday;
        Monday = 21.5;
        double Tuesday;
        Tuesday = 23.7;
        double Wednesday;
        Wednesday = 19.6;
        double Thursday;
        Thursday = 22.5;
        double Friday;
        Friday = 25.3;
        double Saturday;
        Saturday = 21.7;
        double Sunday;
        Sunday = 18.9;

        // Set difference to a vairbale.
        double difference;

        // Set the funcktion round to a varibale.
        float round;

        // Find the defference for the days.
        difference = Tuesday - Monday;
        // Here is round used to get fewer decimals.
        round = ((Math.round(difference * 100f)) / 100f);
        // Print out the result.
        System.out.println("This is the temperature difference from Monday to Tuesday     " + round + "ÂºC");

        // Find the defference for the days.
        difference = Wednesday - Tuesday;
        // Here is round used to get fewer decimals.
        round = ((Math.round(difference * 100f)) / 100f);
        // Print out the result.
        System.out.println("This is the temperature difference from Tuesday to Wensday   " + round + "ÂºC");

        // Find the defference for the days.
        difference = Thursday - Wednesday;
        // Here is round used to get fewer decimals.
        round = ((Math.round(difference * 100f)) / 100f);
        // Print out the result.
        System.out.println("This is the temperature difference from Wensday to Thursday   " + round + "ÂºC");

        // Find the defference for the days.
        difference = Friday - Thursday;
        // Here is round used to get fewer decimals.
        round = ((Math.round(difference * 100f)) / 100f);
        // Print out the result.
        System.out.println("This is the temperature difference from Thursday to Friday    " + round + "ÂºC");

        // Find the defference for the days.
        difference = Saturday - Friday;
        // Here is round used to get fewer decimals.
        round = ((Math.round(difference * 100f)) / 100f);
        // Print out the result.
        System.out.println("This is the temperature difference from Friday to Saturday   " + round + "ÂºC");

        // Find the defference for the days.
        difference = Sunday - Saturday;
        // Here is round used to get fewer decimals.
        round = ((Math.round(difference * 100f)) / 100f);
        // Print out the result.
        System.out.println("This is the temperature difference from Saturday to Sunday   " + round + "ÂºC");
    }
}
