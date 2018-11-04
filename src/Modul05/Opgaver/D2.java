package Modul05.Opgaver;

public class D2 {

    public static void main(String[] args) {

        byte[] radius = {3, 7};

        for (byte i = 0; i < radius.length; i++) {
            System.out.println("This is the perimeter for a circle with the "
                    + "radius " + radius[i] + " " + (2 * radius[i] * Math.PI));
        }
        for (byte i = 1; i < radius.length; i++) {
            System.out.println("This the the perimeter for both circles " +
                    ((2 * radius[i] * Math.PI) + (2 * radius[i - 1] * Math.PI)));
        }
    }
}
