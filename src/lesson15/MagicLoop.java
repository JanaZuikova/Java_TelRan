package lesson15;

public class MagicLoop {


    // for i
    // while
    // do while

    public static int multiply(int a, int b) {

        // for i -------for each
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }

        return result;
    }

    public static int multiply2 (int a, int b) {
        //while
        // at first u think then you do
        int result = 0;
        int count = 0;
        while (count < b){
            result = result + a;
        count++;
    }
     return result;
    }


    public static void myInt2() {
        int a = 6;
        a = a + 7;
        a = a + 4;
        a = a + 9;

    }

    public static int multiply5(int a, int b) {
        // do while
        // first you think and then you do
        int result = 0;
        int count = 0;
        do {
            result = result + a;
            count ++;
        }while ( count < b);
        return result;

    }
}

