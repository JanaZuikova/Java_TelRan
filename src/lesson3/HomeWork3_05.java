package lesson3;

public class HomeWork3_05 {
    public static void main(String[] args) {
        bank();
        System.out.println(countMoneyBankApplication(1000, 7));
    }
    public static void bank(){
        double amount = 1000;
        double gain = 3.5;
        int years = 7;
        double profit = amount * gain / 100 * years;
        System.out.println("The profit in " + years + " years is: " + profit + ". The total amount of money after "
                + years + " years is: " + (amount+profit));

    }

    public static double countMoneyBankApplication(double money, int years) {
    double interest = 3.5;
    double output;
    output = money + (money / 100) * interest * years;
    return output;
    }
}
