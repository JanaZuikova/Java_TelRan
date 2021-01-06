package lesson3;

public class HomeWork3_01 {
    public static void main(String[] args) {
        double area = AreaCircle();

        System.out.println("The area of the Circle ist: \t" + area);
    }

    public static double  AreaCircle(){
        double radius = 5;
        final double PI = 3.14;

        double area = radius * radius * PI;
        return area;
    }

}
