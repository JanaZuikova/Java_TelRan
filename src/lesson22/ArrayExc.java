package lesson22;

import lesson20.Main;

public class ArrayExc {
    public static void main(String[] args) {
        int[] var1 = new int[]{1, 5, 10};
        int[] var2 = new int[]{6, 7, 9};
        Main.printArrayForEach(arrayConcatenation(var1,var2));
    }

    public static int[] arrayConcatenation(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i]; //(i<a.length) ? a[i] : b[a.length-i];// a[i] + b[];
        }
        for (int i = a.length; i <output.length ; i++) {
            output[i] =b[i-a.length];
        }
        return output;
    }
}
