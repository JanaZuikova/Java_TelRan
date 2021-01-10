package lesson25;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        int[][][][][] myLovelyArr = new int[5][][][][];
        //intro();
        //intro2();
        //intro3();
        //intro4();
        intro5();

    }

    private static void intro5() {
        int[] arr = {1,2,3,4,5,6,7,8};
        String myTestString = Arrays.toString(arr);
        System.out.println(myTestString);
        System.out.println(Arrays.toString(arr));
    }

    private static void intro4() {
        int[][] example = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5},
        };
    }

    private static void intro3() {
        int[][] var = new int[5][]; // dvumernyj massiv s zadannymi 5ju strochkami
        var[0] = new int[1];
        var[1] = new int[2];
        var[2] = new int[3];
        var[3] = new int[4];
        var[4] = new int[5];

        for (int[] myLineArray : var) {
            for (int lineElement : myLineArray) {
                System.out.println(lineElement + " ");
            }
            System.out.println();
        }

    }

    private static void intro2() {
        int[][][] arr = new int[5][10][1000];
        int[] myLovelyArray = {1, 2, 3, 4, 5};
        byte[][][] byteArray = {
                {
                        {0, 1, 2},
                        {3, 4, 5},
                        {6, 7, 8},
                },
                {
                        {0, 1, 2},
                        {3, 4, 5},
                        {6, 7, 8},
                },

        };
    }

    private static void intro() {
        String[][] myArray = new String[5][3];
        myArray[0][0] = "1";
        myArray[0][1] = "Matweev";
        myArray[0][2] = "No09435436";

        myArray[1][0] = "2";
        myArray[1][1] = "Sidorov";
        myArray[1][2] = "No574586";

        myArray[2][0] = "3";
        myArray[2][1] = "Savechkin";
        myArray[2][2] = "No574345";

        myArray[3][0] = "4";
        myArray[3][1] = "Petechkin";
        myArray[3][2] = "No987686";

        myArray[4][0] = "5";
        myArray[4][1] = "Ivanov";
        myArray[4][2] = "No576464586";

        prinTwoDStringArray(myArray);
    }

    private static void prinTwoDStringArray(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "  \t");
            }
            System.out.println();
        }
    }
}
