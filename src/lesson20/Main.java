package lesson20;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 28};
       // printArray(array);
        printArrayForEach(array);
    }

    public static void printArrayForEach(int[] array) {
        for (int elementik:array) {
            System.out.print( elementik + ", ");
        }
        System.out.println();
    }

    private static void printArray(int[] input) {
        System.out.println("Nachinaem pechatatj int massiv");
        System.out.println("Dolzhno bytj znachenie  elementa massiva");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println();
    }
}
