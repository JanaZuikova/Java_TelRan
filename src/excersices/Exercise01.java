package excersices;

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false)); // true
        System.out.println(smartDepositBox(false, true)); // true
        System.out.println(smartDepositBox(false, false)); // false
        split();

        System.out.println(smartDepositBoxTwo(true, false)); // false
        System.out.println(smartDepositBoxTwo(false, true)); // false
        System.out.println(smartDepositBoxTwo(false, false)); // false
        System.out.println(smartDepositBoxTwo(true, true)); // true
        split();

        boolean mamaPermission, papaPermission, omaPermission;
        mamaPermission = true;
        papaPermission = true;
        omaPermission = true;
        System.out.println("verySmartDepositBoxVersionThree");
        System.out.println(verySmartDepositBoxVersionThree(mamaPermission, papaPermission, omaPermission));
    }

    public static boolean verySmartDepositBoxVersionThree(boolean mama, boolean papa, boolean oma) {
        return smartDepositBoxTwo(mama, papa) || oma;

    }

    public static boolean verySmartDepositBoxVersionThree2(boolean mama, boolean papa, boolean oma) {
        return (mama && papa) || oma;

    }

    public static boolean smartDepositBoxTwo(boolean mama, boolean papa) {
        return mama && papa;
    }

    public static void split() {
        System.out.println("----------------");
    }

    public static boolean smartDepositBox(boolean mama, boolean papa) {
        boolean result = mama || papa;
        return result;
        // return mama || papa;
    }

}
