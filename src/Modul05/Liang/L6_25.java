package Modul05.Liang;

import java.util.Scanner;

public class L6_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer value: ");
            if (input.hasNextLong()) {
                System.out.println(convertMillis(input.nextLong()));
                break;
            } else {
                input.next();
            }
        }
    }

    public static String convertMillis(long millis) { //returns a string of Hours:Minutes:Seconds
        String results;
        long hours = millis / 3600000; //Extracting the whole numbner of hours
        long minutes = (millis % 3600000) / 60000; //Extracting the whole numbner of minutes
        long seconds = ((millis % 3600000) % 60000) / 1000; //Extracting the whole numbner of seconds
        results = String.format("%d:%d:%d", hours, minutes, seconds);
        return results;
    }
}
