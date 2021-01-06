package excersices;

public class StringExercise {
    public static void main(String[] args) {
       /* System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(helloName("Tel-Ran"));*/

       /* System.out.println(makeOutWord("<<>>", "Yay"));//→"<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));//→"<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));//→"[[word]]"*/

        System.out.println(firstHalf("WooHoo")); //→ "Woo"
        System.out.println(firstHalf("HelloThere")); //→ "Hello"
        System.out.println(firstHalf("abcdef")); //→ "abc"

    }
    public static String firstHalf(String input){
        int half = input.length() / 2;
        return input.substring(0, half);

    }


    public static String makeOutWord(String out, String word) {
        String result = out.substring(0,2) + word + out.substring(2);
        return result;

    }

    public static String helloName(String name) {
        String result = "Hello\t" + name + '!';
        return result;

    }
}
