package lesson16;

public class Lesson16 {
    public static void main(String[] args) {
        // example();
        // myRandom();
        forthMethod();
    }

    private static void forthMethod() {
        char myLovelyChar = (char) ((Math.random() * (122 - 97) + 1) + 97);
        System.out.println(myLovelyChar);

        for (int i = 0; i < 100; i++) {
            char myLovelyChar2 = (char) ((Math.random() * (122 - 97) + 1) + 97);
            System.out.print(myLovelyChar2 + " ");
        }

        int count = 0;
        while (count < 100) {
            char myLovelyChar3 = (char) ((Math.random() * (122 - 97) + 1) + 97);
            System.out.print(myLovelyChar3 + " ");
            count++;
        }
        System.out.println();

        String a = "a";
      /*  System.out.println(a.codePointAt(0));
        System.out.println(a.codePointAt(0));*/
    }

    private static void myRandom() {
        double magic = Math.random();
        System.out.println(magic);
        /*for (int i = 0; i < 100; i++) {
            System.out.println(Math.random());
        }*/
        int normalNumber = (int) (Math.random() * 100);
        System.out.println(normalNumber);

    }

    private static void example() {
        double pi = 3.14;
        int piNew = (int) pi;
        double money = 5.873456348975;
        money = money * 100;
        int newMoney = (int) money;
        System.out.println(newMoney);
        double result = newMoney;
        System.out.println(result);
        result = result / 100;
        result /= 100;
    }

}
