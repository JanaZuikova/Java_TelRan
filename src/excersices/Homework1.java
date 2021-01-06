package excersices;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("More than 20\n");
        System.out.println(more20(20)); // → false
        System.out.println(more20(21)); // → true
        System.out.println(more20(22)); // → true
        System.out.println(more20(85)); // → false
        System.out.println(more20(101)); // → true

        System.out.println("Near 10\n");
        System.out.println(nearTen(12)); // → true
        System.out.println(nearTen(17)); // → false
        System.out.println(nearTen(19)); // → true
    }

    private static boolean nearTen(int i) {
        int number = i % 10;
        int reminder = 10 % number;
        if( reminder <= 2){
            return true;
        } else {
            return false;
        }

        //return reminder <= 2 ? true : false;
    }

    private static boolean more20(int i) {
        int rest = i % 20;
        if (rest == 1 || rest == 2) {
            return true;
        } else {
            return false;
        }

    }

}
