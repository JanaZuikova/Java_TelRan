package lesson12;

public class HelloWhile {
    public static void main(String[] args) {
        // v to vremja kak- poka
        // while
        int a = 10;
        int b = 50;
       // evenAB(a, b);
        helloWhile(a, b);
    }

    private static void helloWhile(int x, int y) {
        x = 55;
        do {
            System.out.println(x);
            x++;
        } while (x < y);
    }

    private static void evenAB(int a, int b) {
        while (a < b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }

    }
}
