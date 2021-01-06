package lesson18;

public class ArrayExcer3 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 9};
        int[] a3 = new int[]{7, 0, 0};

       reverse3(a1); //→ [3, 2, 1]
       reverse3(a2);// → [9, 11, 5]
       reverse3(a3); //→ [0, 0, 7]

    }

    private static int[] reverse3(int[] array) {
        int [] output = new int[3];
        output[0] = array[2];
        output[1] = array[1];
        output[2] = array[0];


        return output;

    }
}
