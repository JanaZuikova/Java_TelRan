package lesson23;

import lesson20.Main;

public class Homework23 {
    public static void main(String[] args) {
        //Given an array of ints length 3, figure out which is larger,
        // the first or last element in the array, and set all the other
        // elements to be that value. Return the changed array.

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};
        Main.printArrayForEach(maxEnd3(arr1));// → [3, 3, 3]
        Main.printArrayForEach(maxEnd3(arr2));// → [11, 11, 11]
        Main.printArrayForEach(maxEnd3(arr3));// → [3, 3, 3]
        System.out.println("___________");

        //Given an array of ints, return a new array length 2 containing
        // the first and last elements from the original array.
        // The original array will be length 1 or more.

        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 3, 4};
        int[] arr6 = new int[]{7, 4, 6, 2};

        Main.printArrayForEach(makeEnds(arr4));// → [1, 3]
        Main.printArrayForEach(makeEnds(arr5));// → [1, 4]
        Main.printArrayForEach(makeEnds(arr6));// → [7, 2]
        System.out.println("_________");

        //Given an int array, return a new array with double the length where its last element
        // is the same as the original array, and all the other elements are 0. The original array
        // will be length 1 or more. Note: by default, a new int array contains all 0’s.

        int[] arr7 = new int[]{4, 5, 6};
        int[] arr8 = new int[]{1, 2};
        int[] arr9 = new int[]{3};

        Main.printArrayForEach(makeLast(arr7)); //→ [0, 0, 0, 0, 0, 6]
        Main.printArrayForEach(makeLast(arr8)); //→ [0, 0, 0, 2]
        Main.printArrayForEach(makeLast(arr9)); // → [0, 3]
    }

    private static int[] makeLast(int[] array) {
        int[] result = new int[array.length * 2];
        result[result.length-1] = array[array.length-1];
        return result;
    }

    private static int[] makeEnds(int[] array) {
        int[] result = new int[2];
        if (array.length > 1) {
            result[0] = array[0];
            result[1] = array[array.length - 1];
        } else {
            result[0] = array[0];
            result[1] = array[0];
        }
        return result;
    }

    private static int[] maxEnd3(int[] array) {
        int[] result = new int[array.length];
        int max = array[0];
        if (array[0] > array[array.length - 1]) {
            max = array[0];
        } else {
            max = array[array.length - 1];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = max;
        }
        return result;
    }
}
