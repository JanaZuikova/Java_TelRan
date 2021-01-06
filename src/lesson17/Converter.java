package lesson17;

public class Converter {
    public static void main(String[] args) {
        System.out.println(convertDecimalToBinary(78));
    }

    private static String convertDecimalToBinary(int decimal) {
        String output = "";
        for (int i = decimal; i >0 ; i /= 2) {
            int remainder = decimal % 2; // nahodim cifru iz dvoichnogo chisla v rezultate
            output = output + remainder;
        }
        return output;
    }

    public static String convertDecimalToBinaryWhile(int decimal) {
        String output = "";
        while (decimal > 0){
            int remainder = decimal % 2; // nahodim cifru iz dvoichnogo chisla v rezultate
            output = output + remainder;// zapisyvaem cifru v nash rezuljtat
            decimal = decimal / 2; // delim INPUT na 2 i pereispoljzuem ego
        }

        return output;

    }

}
