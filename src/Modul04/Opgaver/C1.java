package Modul04.Opgaver;

public class C1 {

    public static void main(String[] args) {

        byte[] radius = {1, 2, 3, 4, 5};

        for (byte i = 0; i < radius.length; i++) {
            double area = Math.PI * Math.pow(radius[i], 2);
            System.out.println(area);
        }
    }

}
