package Modul03.Opgaver;

public class B1 {

    public static void main(String[] args) {

        double radius;
        radius = 1;

        while (radius <= 5) {
            double area = (int) (Math.PI * Math.pow(radius, 2));
            System.out.println("The area is: " + area);
            radius++;
        }
    }

}
