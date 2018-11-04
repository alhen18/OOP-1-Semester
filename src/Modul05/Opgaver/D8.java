package Modul05.Opgaver;

public class D8 {

    public static void main(String[] args) {
        int[][] suduku = new int[][]{
                {7, 3, 5, 6, 1, 4, 8, 9, 2},
                {8, 4, 2, 9, 7, 3, 5, 6, 1},
                {7, 6, 1, 2, 8, 5, 3, 7, 4},
                {2, 8, 6, 3, 4, 9, 1, 5, 7},
                {4, 3, 1, 8, 5, 7, 9, 2, 6},
                {5, 7, 9, 1, 2, 6, 4, 3, 8},
                {1, 5, 7, 4, 9, 2, 6, 8, 3},
                {6, 9, 4, 7, 3, 8, 2, 1, 5},
                {3, 2, 8, 5, 6, 1, 7, 4, 9}
        };
        for (int i = 0; i < suduku.length; i++) {
            for (int j = 0; j < suduku.length; j++) {
                System.out.printf((j == 0 ? "" : " ") + suduku[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.println("The suduko yeilds " + (sudukoTest(suduku) ? "True" : "false"));
    }

    public static boolean sudukoTest(int[][] suduko) {
        boolean result = true;
        int[] val = new int[9];

        //Testing vertical
        for (int j = 0; j < suduko.length; j++) {
            for (int i = 0; i < suduko.length; i++) {
                val[suduko[i][j] - 1]++;
            }
            for (int i = 0; i < val.length; i++) {
                if (val[i] != 1) {
                    result = false;
                    return result;
                }
            }
            clearIntArray(val);
        }
        //Testing horisontal
        for (int j = 0; j < suduko.length; j++) {
            for (int i = 0; i < suduko.length; i++) {
                val[suduko[j][i] - 1]++;
            }
            for (int i = 0; i < val.length; i++) {
                if (val[i] != 1) {
                    result = false;
                    return result;
                }
            }
            clearIntArray(val);
        }
        //Testing squares
        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        val[suduko[i + k][j + l] - 1]++;
                    }
                }
                for (int k = 0; k < val.length; k++) {
                    if (val[k] != 1) {
                        result = false;
                        return result;
                    }
                }
                clearIntArray(val);
            }
        }
        return result;
    }

    public static void clearIntArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = 0;
        }
    }
}
