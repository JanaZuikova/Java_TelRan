package lesson16;

public class CoffeeMachine {
    public static void hotWater(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }


    public static void cappuccino() {
        System.out.println("Cuppuccino is ready");
        milk(30);
        hotWater(20);
        coffee(40);
        System.out.println("blalbabla");
    }

    public static void latte (){
        System.out.println("Latte is ready");
        hotWater(100);
        coffee(20);
        System.out.println("----");
    }

    public static void tee(int ml){
        hotWater(100);
        System.out.println("Get your tee from the right box");
    }

    public static void americano() {
        System.out.println("Americano is ready");
        hotWater(100);
        coffee(20);
        System.out.println("----");
    }

    public static void coffee(int mg) {
        System.out.printf("Added %d mg of coffee \n", mg);
    }

    public static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

}
