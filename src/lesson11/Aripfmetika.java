package lesson11;

public class Aripfmetika {
    public static void main(String[] args) {
        introOne();
        introTwo();

    }

    private static void introTwo() {
        //0000 1010;  = 10
        //0001 0010;  = 18
        int a = 10;
        int b = 18;
        int c = a & b;
        System.out.println(c);
        c = a | b;
        System.out.println(c);
        c = a ^ b;
        System.out.println(c);
    }

    private static void introOne() {
        int a = 5;
        a = a + 1;
        a++;
        a += 1;// a = a+1;
        System.out.println(a);

        int b = 4;
        a *= b; // a = a*b;
        System.out.println(a);
        a %= b;
        System.out.println(a);
    }
}
