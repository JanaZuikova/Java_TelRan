package lesson17;

public class Exec1 {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));// → true
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// → true
        System.out.println(makeBricks(3, 2, 10));// → false
    }

    private static boolean makeBricks(int smallCount, int bigCount, int goal) {
        if (goal - bigCount * 5 == 0) {
            return true;
        } else if (goal - bigCount * 5 - smallCount <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
