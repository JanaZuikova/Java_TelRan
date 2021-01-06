package lesson5;

public class Homework5_01 {
    public static void main(String[] args) {
        System.out.println(bigBadaBoom(true, true));// true
        System.out.println(bigBadaBoom(false, false)); // false
        System.out.println(bigBadaBoom(true, false)); // false
        split();

        System.out.println(doorbell(true, true)); //false
        System.out.println(doorbell(false, false)); // false
        System.out.println(doorbell(true, false)); // true


    }

    public static boolean bigBadaBoom(boolean one, boolean two) {
        return one && two;

    }

    public static boolean doorbell(boolean one, boolean two) {
        // return one ^ two;
        // return !(one == two);
        return one != two;

    }


    public static void split() {
        System.out.println("----------------");
    }
}
