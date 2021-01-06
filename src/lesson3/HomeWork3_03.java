package lesson3;

public class HomeWork3_03 {
    public static void main(String[] args) {
        double euro = exchangeRate();
        System.out.println("Cost of the euro is:\t" + euro);

        double dollar = exchangeRate2();
        System.out.println("Cost of dollar is:\t" + dollar);
        System.out.println("Pri dannyh\t" + 1000 + "\tDollar\t" + "klient poluchit\t" + currencyConventer(1000));
    }

    public static double exchangeRate() {
        double dollar = 1;
        double euro = 1.1 * dollar;
        return euro;
    }

    public static double exchangeRate2() {
        double euro = 1;
        double dollar = euro / 1.1;
        return dollar;
    }
    // we did it at school with teacher
    public static double currencyConventer(double dollar) {
        double rate = 1.1;
        double euro = dollar / rate;
        return euro;
    }
}
