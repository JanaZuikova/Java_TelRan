package lesson11;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));// → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"
    }

    private static String fizzString(String str) {
        boolean magicString3 = str.startsWith("f") && str.endsWith("b");


        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";

        } else if (str.charAt(0) == 'f') {
            return "Fizz";

        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        }
        return str;
    }


    private static String fizzStringTwo(String str) {
        //1. отсеять те кто начинаются с "f" и заканчиваются на "b"
        //2. те кто начинаются с "f"
        int lastLetter = str.length() - 1;
        if (str.substring(0, 1).equals("f") && str.substring(lastLetter).equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";

        } else if (str.substring(lastLetter).equals("b")) {
            return "Buzz";
        }
        return str;
    }

    private static String fizzStringOne(String str) {
        if (str.startsWith("f")) {
            return "Fizz";
        }
        if (str.endsWith("b")) {
            return "Buzz";
        }
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        }
        return str;
    }


}
