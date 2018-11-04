package Modul04.Liang;

import java.util.Scanner;

public class L8_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double average = 0;
        double[][] matrix = new double[4][4];
        String[] xLine = new String[]{"first", "second", "third", "fourth"};
        System.out.println("Enter four lines of four numbers");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Enter the %s line: ", xLine[i]);
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            average += matrix[i][i];
        }
        average = average / 4;
        System.out.println("Average of the elements in the major diagonal is " + average);
    }
}
