package lesson13;

public class DigitGame {
    public static void main(String[] args) {
        //456: ->
        // 4+5+6 = 15;
        // 1. cherez stroku
        // 364 -> 13
        // cherez stroku
        System.out.println(myMagicSum(456));
        System.out.println(myMagicSumUno(456));
    }

    private static int myMagicSumUno(int number) {
        String input = String.valueOf(number);
        System.out.println("pereveli int v string" + input);
        int size = input.length();
        int result = 0;
        for (int i = 0; i < size; i++) {
            int temp = Integer.parseInt(input.substring(0, 1));
            System.out.println("Neponjatnyj int temp" + temp);
            result = result + temp;
            input = input.substring(1);

        }
        return result;
    }

    private static int myMagicSum(int number) {

        return 0;
    }
}
