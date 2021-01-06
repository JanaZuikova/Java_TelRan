package lesson13;

public class Amazon {
    public static void main(String[] args) {
    /*  А -200x200x200 мм
        Б -150x150x150 мм
        В -250x250x250 мм
        Г -350x400x500 мм
        Д -400x400x400 мм*/
        double basketball = 320;
        double volleyball = 250;
        System.out.println(boxType(100));
        System.out.println(boxType(200));
        System.out.println(boxType(330));
        System.out.println(boxType(500));
        System.out.println(boxType(volleyball));
        System.out.println(boxType(basketball));

    }
    public static String boxType(double ball) {
        ball = ball * 1.05;
        if (ball <= 150) {
            return "Type B";
        } else if (ball <= 200) {
            return "Type A";
        } else if (ball <= 250) {
            return "Type C";
        } else if (ball <= 350) {
            return "Type D";
        } else if (ball <= 400) {
            return "Type E";
        }else {
            return "Unknown size";
        }
    }

}
