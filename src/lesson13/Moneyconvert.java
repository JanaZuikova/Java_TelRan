package lesson13;

public class Moneyconvert {
    public static void main(String[] args) {
        // “EUR”,”RUR”,”USD”,”GPB”
        // USD = 1.0
        System.out.println(currencyConventer(1000, "EUR"));
        System.out.println(currencyConventer(700, "GPB"));
        System.out.println(currencyConventer(100, "USD"));
        System.out.println(currencyConventer(500, "RUB"));
        System.out.println(justAsking("GPB", "EUR"));
        System.out.println(justAsking("RUB", "EUR"));
    }
    public static double justAsking(String input, String output){
        double curs = findCourse(input) / findCourse(output);
        return curs;
    }

    public static double findCourse(String currencyName) {
        double currencyCourse = 0.0;
        switch (currencyName) {
            case "USD":
                currencyCourse = 1.0;
                break;
            case "GPB":
                currencyCourse = 1.33;
                break;
            case "RUB":
                currencyCourse = 0.014;
                break;
            case "EUR":
                currencyCourse = 1.21;
                break;
            default:
                currencyCourse = 0;
                break;
        }
        return currencyCourse;
    }

    private static double currencyConventer(double money, String currencyName) {
        return money * findCourse(currencyName);
        }

    }
