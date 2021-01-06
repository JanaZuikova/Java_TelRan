package lesson10;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println(leapYear(2000)); // true
        System.out.println(leapYear(2020)); // true
        System.out.println(leapYear(1800)); // false
        System.out.println(leapYear(2021)); // false
        split();
        System.out.println(giveMeEvenNumber(3));
        System.out.println(giveMeEvenNumber(2));
        System.out.println(giveMeOddNumber(11));

    }

    private static boolean giveMeOddNumber(int number) {
        return !giveMeEvenNumber(number);
    }

    private static boolean giveMeEvenNumber(int number) {
        return number % 2 == 0;
    }


    private static void split() {
        System.out.println("-----------");
    }

    private static boolean leapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 ^ year % 100 == 0);

    }
}
