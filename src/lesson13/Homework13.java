package lesson13;

public class Homework13 {
    public static void main(String[] args) {
        /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
        If they are all the value 2, the result is 10.
        Otherwise if they are all the same, the result is 5.
         Otherwise so long as both b and c are different from a, the result is 1.
        Otherwise the result is 0.*/

        System.out.println(redTicket(2, 2, 2)); //→ 10
        System.out.println(redTicket(2, 2, 1)); // → 0
        System.out.println(redTicket(0, 0, 0)); // → 5

/*      Given 2 strings, a and b, return a new string made of the first char of
        a and the last char of b, so "yo" and "java" yields "ya". If
        either string is length 0, use '@' for its missing char.*/

        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java"));// → "ya"
        System.out.println(lastChars("hi", ""));// → "h@"
    }

    private static String lastChars(String a, String b) {
        String letter1 = "@";
        String letter2 = "@";

        if(a.length() > 0) {
            letter1 =  a.substring(0,1);
        }

        if(b.length()>0) {
            letter2 = b.substring(b.length() - 1);
        }

        return letter1+letter2;

    }

    private static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && 2 == c) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }
}
