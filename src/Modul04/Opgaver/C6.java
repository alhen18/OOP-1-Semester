package Modul04.Opgaver;

public class C6 {

    public static void main(String[] args) {

        // Decaire variable.
        double[] index = {35.2, 35.8, 68.7, 24.6};
        double highest = 0;
        // For loop that count i from 0 to it hit the length of the index array.
        for (int i = 0; i < index.length; i++) {
            // if loop that sort the valuves in the array index.
            if (index[i] < highest) {
                highest = index[i];
            }
            // Print out the highest valuve in the array index.
            System.out.println(highest = index[i]);
        }
    }
}
