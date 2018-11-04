package Modul05.Opgaver;

import java.util.Scanner;

public class D7 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int[][] input = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        while (true) {

            input = golCheckNeighber(input.clone());
            golPrint(input);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {

            }
            System.out.println("");
        }
    }

    public static int[][] golCheckNeighber(int[][] input) {
        int[][] buffer = new int[input.length][input[0].length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                int liveNeighbers = 0;
                //System.out.printf("i: %d j: %d  iLenghth: %d jLength: %d%n", i, j, input.length, input[i].length);
                if (i != 0 && j != 0) {
                    //Top left
                    liveNeighbers += input[i - 1][j - 1];
                }
                if (i != 0) {
                    //Top mid
                    liveNeighbers += input[i - 1][j];
                }
                if (i > 0 && j < (input[i].length - 1)) {
                    //Top right
                    liveNeighbers += input[i - 1][j + 1];
                }
                if (j != 0) {
                    //Left
                    liveNeighbers += input[i][j - 1];
                }
                if (j < (input[i].length - 1)) {
                    //Right
                    liveNeighbers += input[i][j + 1];
                }
                if (i < (input.length - 1) && j != 0) {
                    //Lower left
                    liveNeighbers += input[i + 1][j - 1];
                }
                if (i < (input.length - 1)) {
                    //Lower mid
                    liveNeighbers += input[i + 1][j];
                }
                if (i < (input.length - 1) && j < (input[i].length - 1)) {
                    //Lower right
                    liveNeighbers += input[i + 1][j + 1];
                }
                //System.out.println("Live Neighbers " + liveNeighbers);
                if (liveNeighbers > 3 || liveNeighbers < 2) {
                    buffer[i][j] = 0;
                } else if (liveNeighbers == 3) {
                    buffer[i][j] = 1;
                } else if (liveNeighbers == 2 && input[i][j] == 1) {
                    buffer[i][j] = 1;
                }
            }
        }
        return buffer;
    }

    public static void golPrint(int[][] input) {
        String paddingString = "-----------------------------------";
        System.out.println(paddingString);
        for (int i = 0; i < input.length; i++) {
            System.out.printf("|");
            for (int j = 0; j < input[i].length; j++) {
                System.out.printf("%s", (input[i][j] == 1 ? "\176" : "\177"));
            }
            System.out.printf("|%n");
        }
        System.out.printf(paddingString);
    }
}
