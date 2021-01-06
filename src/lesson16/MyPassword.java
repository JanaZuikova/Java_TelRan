package lesson16;

public class MyPassword {
    public static void main(String[] args) {
        // do 20 Passwords
        // big (O)
        // 1. You have to do the symbol
        // 2. You have to do the password
        // 3. Repeat the operation requested time
       /* System.out.println(giveMeChar(97, 122));
        System.out.println(giveMeChar('a', 'z'));
        System.out.println(giveMePass(20));*/
        nTimesPassGenerator(20);
    }

    public static void nTimesPassGenerator(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(giveMePass(10));

        }
    }

    private static String giveMePass(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + giveMeChar(97, 122);
        }
        return result;
    }

    private static String giveMeChar(int min, int max) {
        String result = "";
        char myChar = (char) ((Math.random() * (max - min) + 1) + min);
        // result = String.valueOf(myChar);
        result = "" + myChar;
        return result;
    }

}
