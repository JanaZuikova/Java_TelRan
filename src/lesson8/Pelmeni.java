package lesson8;

public class Pelmeni {
    public static void main(String[] args) {
        happyPelmeni();
    }

    public static void happyPelmeni() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Happy pelmen\t" + i);
            }
        }
    }
}
