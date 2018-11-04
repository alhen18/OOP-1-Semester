package Modul04.Opgaver;

public class C4 {

    public static void main(String[] args) {

        // declair variable.
        int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};

        // for loop that count i to it hit the length of the array month.
        for (int i = 0; i < month.length; i++) {
            // Print out the month number and number of days in the month.
            System.out.println("month " + (i+1) + " has " + month[i] + " days");
        }
    }
}
