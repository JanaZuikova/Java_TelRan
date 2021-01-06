package lesson18;

public class Excer2_DeFront {
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));// → "llo"
        System.out.println(deFront("java"));// → "va"
        System.out.println(deFront("away"));// → "aay"
    }

    private static String deFront(String input) {
        String output = input.substring(2);
        if (input.substring(1, 2).equals("b")) {
            output = "b" + output;
        }
        if (input.charAt(0) == 'a') {
            output = 'a' + output;
        }

        return output;
    }
}
