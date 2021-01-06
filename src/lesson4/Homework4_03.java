package lesson4;

public class Homework4_03 {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
        System.out.println(makeOutWord("!??!", "Vasilij"));
        String hausmeister = "Vasilij";
        System.out.println(hausmeister.substring(0,3));
        System.out.println(hausmeister.substring(5,7));
    }

        public static String makeOutWord(String out, String word){
        String result = "";
        result = out.substring(0,2) + word + out.substring(2);
        return result;
    }

}
