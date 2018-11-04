package Modul04.Opgaver;

public class C5 {

    public static void main(String[] args) {

        boolean found;
        int lastPrime = 0;
        long time = System.nanoTime();
        for (int i = 3; i < 1000000; i += 2) {
            found = false;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                lastPrime = i;
            }
        }
        System.out.println(lastPrime);
    }
}
