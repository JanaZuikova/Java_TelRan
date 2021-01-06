package lesson12;

public class Homework12 {
    public static void main(String[] args) {
        /*Given three ints, a b c, return true if b is greater than a, and c is greater than b.
        However, with the exception that if "bOk" is true, b does not need to be greater than a. *
        */
        System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true
        split();
        /*Given three ints, a b c, return true if one
        of them is 10 more or less than one of the others.*/
        System.out.println(lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true
        split();
        //Given a string, return a string length 1 from its front, unless front is false,
        // in which case return a string length 1 from its back.
        //The string will be non-empty.
        System.out.println(theEnd("Hello", true));// → "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"
        split();
        //Given a string, return true if it ends in "ly".
        System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false
        split();
        /*Given a string of odd length, return the string length 3 from its middle,
        so "Candy" yields "and". The string length will be at
        least 3.*/
        System.out.println(middleThree("Candy"));// → "and"
        System.out.println(middleThree("and"));// → "and"
        System.out.println(middleThree("solving"));// → "lvi"
    }

    private static String middleThree(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }

    private static boolean endsLy(String y) {
      //  if (y.length() >= 2) {
      //      return y.substring(y.length() - 2).equals("ly");
        return y.endsWith("ly");

    }

    private static String theEnd(String str, boolean b) {
        if (b == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }
    
    private static boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10);
    }

    private static void split() {
        System.out.println("--------------");
    }

    private static boolean inOrder(int a, int b, int c, boolean x) {
        if (x == true && c > b) {
            return true;
        } else if (b > a && c > b) {
            return true;
        } else {
            return false;
        }
    }
}
