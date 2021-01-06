package lesson13;

public class HomeworkWindowsDoors {
    static double framePrice = 100.0;
    public static void main(String[] args) {
        double finalPrise = countCost(8, 4, 180, 175);
        System.out.println("In total \t" + finalPrise);
    }

    private static double countCost(int doors, int windows, double high, double wide) {
        return doorsPrice(doors) + windowsPrice(windows, high, wide);
    }

    private static double windowsPrice(int windows, double high, double wide) {

        high = high / 2;
        wide = wide / 2;
        double perimeter = (high + wide)*2;
        double area = wide * high;
        double glassPrice = 100;

        return (perimeter * framePrice + area * glassPrice);
    }

    private static double doorsPrice(int doors) {
        double doorsMeterPrice = 120.0;
        double a = 2.0;
        double b = 0.9;
        double perimeter = (a + b) * 2;
        double area = a * b;


        return (perimeter * framePrice + area * doorsMeterPrice) * doors;
    }
}
