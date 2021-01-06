package lesson7;

public abstract class MagicGame {
    public static void main(String[] args) {
        // variant1();
        // variant2();
        variant3();

    }

    public static void variant3() {
    int a = 5;
    int b = 8;
    a = a +b -(a = b); // 13 - 5; b = 5
        System.out.println(a);
        System.out.println(b);

    }

    public static void variant2() {
        int a = 5;
        int b = 8;
        a = a + b; // 13
        b = a - b; // 13-8 = 5
        a = a - b; //13 - 5
        System.out.println(a);
        System.out.println(b);
    }

    public static void variant1() {
        // swap;
        int a = 5;
        int b = 8;
        // code

        int temp = a;
        a = b;
        b = temp;

        // b = 5;
        // a = 8;
    }
}
