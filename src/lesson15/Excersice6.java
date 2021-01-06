package lesson15;

public class Excersice6 {
    public static void main(String[] args) {
        rectangel(5, 7);
        combinationThree();
    }


    public static void combinationThree() {
        int result = 36;
        for (int z = 1; z <= result; z++) {
            for (int y = 1; y <= z; y++) {
                for (int x = 0; x <= y; x++) {
                    if (x * y * z == 36 && x <= y && y <= z) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }

    }


    public static void rectangel(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
