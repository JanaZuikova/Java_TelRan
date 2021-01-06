package lesson5;

public class Homework5_03 {
    public static void main(String[] argv) {
        System.out.println(smartDoorCheckKey(true, true)); // false
        System.out.println(smartDoorCheckKey(true, false)); // true
        System.out.println(smartDoorCheckKey(false, true)); // true
        System.out.println(smartDoorCheckKey(false, false)); // true
    }

    public static boolean smartDoorCheckKey(boolean electricity, boolean internet) {
        return !(electricity && internet);
    }
}
