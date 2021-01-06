package lesson18;


public class GuestGameHomework {
    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));// → 1
        System.out.println(countCode("codexxcode"));// → 2
        System.out.println(countCode("cozexxcope"));// → 2
    }

    private static int countCode(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c'
                    && input.charAt(1) == 'o'
                    && input.charAt(i) == 'd'
                    && input.charAt(i) == 'e') {
                count++;
            }
        }

        return count;
    }

}


