package lesson21;

public class Cesar {
    public static void main(String[] args) {
        //System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));

    }

    private static String enigmaCaesar(String input) {
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            output = output + symbolCode(input.charAt(i));
        }
        return output;
    }

    private static char symbolCode(char symbol) {
        char result = symbol;
       // result = (char) (symbol + 3);


        String input = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ,.";
        String output = "гдеёжзийклмнопрстуфхцчшщъыьэюяабв ,.";

        int index = input.indexOf(symbol);
        result = output.charAt(index);
        return result;
    }
}
