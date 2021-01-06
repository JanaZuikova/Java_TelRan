package lesson02;

public class HomeWork2 {
    public static void main(String[] args) {
        // we have to find a perimeter and square of rectangle
        // we have a square with a size 5;
        // we have to find the area and perimeter;
        // int a = 5; int b = 10;
        findPerimeter();
        findSquare();
    }
    public static void findPerimeter() {
        int a = 5;
        int b = 10;
        int perimeter = (a + b) * 2;
        System.out.println("Perimeter of rectangle:\t" + perimeter);
    }

    public static void findSquare() {
        int a = 5;
        int b = 10;
        int square = a * b;
        System.out.println("Area of the square is:\t" + square);

    }

}
