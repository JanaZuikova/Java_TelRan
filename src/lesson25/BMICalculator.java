package lesson25;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        calculator();

    }

    private static void calculator() {
        double userW = weightFinder();
        double userH = highFinder();
        System.out.println("Body index mass compares : " + bmiFinder(userW, userH));
    }

    private static double highFinder() {
        double high;
        System.out.println("Vvedite rost poljzovatelja, v metrah, naprimer 1.75: ");
        Scanner input = new Scanner(System.in);
        high = input.nextDouble();
        if (high > 100) {
            high = high / 100;
        }
        return high;
    }

    private static double weightFinder() {
        double weight;
        System.out.println("VVedite ves poljzovatelja: ");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        return weight;
    }

    // вес в килограммах, рост в метрах - 55 кг, 1.75 метров
    private static double bmiFinder(double weight, double high) {
        return weight / (high * high);
    }
}
