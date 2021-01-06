package lesson02;

public class HomeWork1 {
    public static void main(String[] args) {
        // we have a square with a size 5;
        // we have to find the area and perimeter;
        // int = 5;
        findPerimeter();
        findSquare();
    }

    public static void findPerimeter() {
        int a = 5;
        int perimeter = a * 4;
        System.out.println(" Perimeter of the square is:\t" + perimeter);
    }

    public static void findSquare() {
        int a  = 5;
        int square = a * a;
        System.out.println("Area of the square is:\t" + square);
    }
}
