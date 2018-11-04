package Modul04.Opgaver;

public class C3 {

    public static void main(String[] args) {

        double[] temp = {21.5, 23.7, 19.6, 22.5, 25.3, 21.7, 18.9};

        for (int i = 1; i < temp.length; i++) {
            System.out.println(temp[i] - temp[i - 1]);
        }
    }
}
