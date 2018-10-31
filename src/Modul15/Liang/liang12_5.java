package Modul15.Liang;

public class liang12_5 {

    public static void main(String[] args) {

        Triangle validTriangle = new Triangle();

        try {
            Triangle invalidTriangle = new Triangle(1, 10, 1);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
