package excersices;

public class Exer11Nmb7 {
    public static void main(String[] args) {
        System.out.println("Number 7\t");
        System.out.println(twoAsOne(1, 2, 3));// → true
        System.out.println(twoAsOne(3, 1, 2));// → true
        System.out.println(twoAsOne(3, 2, 2));// → false
        System.out.println("Number 8\t");
        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3));// → true
        System.out.println("Number 9\t");
       /* System.out.println(maxMod5(2, 3)); // → 3
        System.out.println(maxMod5(6, 2)); // → 6
        System.out.println(maxMod5(3, 2)); // → 3*/
    }

    private static void maxMod5(int value, int value2) {
        int min = Math.min(value, value2);
        int max = Math.max(value, value2);

        if (value > value2) {
            min = value2;
            max = value;
        } else {
            min = value;
            max = value2;
        }


/*        if (value == value2) {
            return 0;
        } else if (value % 5 == value2 % 5) {
            return min;
        } else {
            return max;
        }
 */

    }

    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
    }


    private static boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || b + c == a || a + c == b);
    }
}
