package lesson21;

public class Homework {
    public static void main(String[] args) {
        System.out.println(myLovelyCharAt(4, "Vasilij"));
        System.out.println(myLovelyCharAt(2, "Arnold"));

        String hausmaster = "Vasilij";
        char[] magicArray = hausmaster.toCharArray();
        myCharPrint(magicArray);

    }

    public static void myCharPrint(char[] input){
        for(char symbol : input){
            System.out.print(symbol + "  ");
        }
        System.out.println("]");
    }


    private static String myLovelyCharAt(int index, String word) {
        return word.substring(index, index + 1);

    }
}
