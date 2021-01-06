package lesson18;

public class HowToPrintIntArray {
    public static void main(String[] args) {
        int []a1 = new int []{3,4,6,7};
        //myPrint(a1);
        System.out.println(a1);
    }

    public static void myPrint(int[] array) {
        System.out.println("Int massiv in print, by adress" + array + "has following: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ", ");
        }
        System.out.println("\n Massiv printed ");
    }

}
