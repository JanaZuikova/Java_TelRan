package lesson8;

import javax.swing.*;

public class Na3BezOstatka {
    public static void main(String[] args) {
        // modulo3();
        //myLine(100);
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        alphabeth();
    }

    public static void modulo3() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "Number is devidiable 3 ");
            }
        }
    }

    public static void myLine(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    public static void alphabeth(){
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("" + c+c+c+c);

        }
    }
}
