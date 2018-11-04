package Modul2.Opgaver;

public class A2 {

    public static void main(String[] args) {

        // Set names to variables.
        double radius;
        double perimeter;
        double result;

        // Definde the variables.
        radius = 3;
        perimeter = 2 * radius * Math.PI;
        // Print out the result.
        System.out.println("This is the perimeter for a circle with radius three is " + perimeter);

        // Set a variable for the result for the perimeter.
        double result1 = perimeter;

        // Defind the variables.
        radius = 7;
        perimeter = 2 * radius * Math.PI;
        // Print out the result.
        System.out.println("This is the perimeter for a circle with radius seven is " + perimeter);

        // Set a variable for the result for the perimeter.
        double result2 = perimeter;

        // Get a total result for both perimeters.
        result = result1 + result2;
        // Print out the result.
        System.out.println("The is the perimeter for both circels " + result);

    }
}
