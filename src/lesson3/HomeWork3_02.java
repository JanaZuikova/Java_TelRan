package lesson3;

public class HomeWork3_02 {
    public static void main(String[] args) {
        double lenght = lenghtCircle();
        System.out.println("The lenght of the circle is:  " + lenght);
        System.out.println(giveMeLenghtCircle(7.8));
        System.out.println(giveMeLenghtCircle(8.5));

    }

    public static double lenghtCircle() {
        double radius = 5;
        final double PI = 3.14;

        double lenght = 2 * PI * radius;
        return lenght;
    }

    public static double giveMeLenghtCircle(double radius){
        double PI = 3.14;
        double lenght = 2 * PI * radius;
        return lenght;
    }

}
