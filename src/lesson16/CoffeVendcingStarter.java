package lesson16;

public class CoffeVendcingStarter {
    public static void main(String[] args) {
      myChoise(1);
    }

    private static void myChoise(int costumerChoice) {
        switch (costumerChoice){
            case 3:
                CoffeeMachine.latte();
                break;
            case 1:
                CoffeeMachine.americano();
                break;
            case 2:
                CoffeeMachine.cappuccino();
                break;
            case 4:
                CoffeeMachine.tee(100);
                break;
            default:CoffeeMachine.hotWater(100);
                break;
        }
    }
}
