package lesson4;

public class HelloString {
    public static void main(String[] args) {
        //magicString();
        //jamesBond();
        // london();

        intToString();
    }

    public static void intToString() {
        int digit = 10;
        String text = String.valueOf(digit);
        System.out.println(text);
        int tryAndCry = Integer.parseInt(text);
        System.out.println(tryAndCry);

        String anatebe = "10";
        int myTry = Integer.parseInt(anatebe);
        System.out.println(myTry);
    }

    public static void london() {
        String myLife = "London is the capital of Great Britan";
        System.out.println(myLife);
        System.out.println(myLife.toLowerCase());
        System.out.println(myLife.toUpperCase());
        System.out.println(myLife.substring(0, 1).toUpperCase() + myLife.substring(1).toLowerCase());
        String game = myLife.substring(0, 2).toUpperCase() + myLife.substring(2, 4).toLowerCase() + myLife.substring(4, 6).toUpperCase() +
                myLife.substring(6, 8).toLowerCase();
        System.out.println(game);

    }

    public static void magicString() {
        String firstName = "Jana";
        String secondName = "Zuikova";
        String user = firstName + secondName;
        int size = user.length();
        System.out.println(size);
        String first10Chars = user.substring(0, 10);
        System.out.println(first10Chars);
        System.out.println(first10Chars.toUpperCase());

    }

    public static void jamesBond() {
        String userFirstName = "James";
        String copyright = "©";
        char copyright2 = '©';
        String userSecondName = "Bond";
        int age = 35;
        System.out.println(userFirstName + " " + userSecondName + " " + age);
        String welcomeMessage = userFirstName + " " + userSecondName + " " + age;
        System.out.println(welcomeMessage);

    }
}
