package lesson7;

public class Homework07_02 {
    public static void main(String[] args) {
        trueWayOne("right");
        System.out.println(trueWayTwo(3));
        trueWayTree(2);

    }

    public static void trueWayTree(int way){
        switch (way) {
            case 1:
                System.out.println("variant 1");
                break;
            case 2:
                System.out.println("variant 2");
                break;
            case 3:
                System.out.println("variant 3");
                break;
            default:
                System.out.println("wrong variant");
                break;
        }

    }

    public static void trueWayOne(String way) {
        // if(way =="left"){
        if (way.equals("left")) {
            System.out.println("You will find this....");
        } else if (way.equals("right")) {
            System.out.println("You will find that....");
        } else if (way.equals("straight")) {
            System.out.println("Will find something more....");
        } else {
            System.out.println("do not go....");

        }

    }

    public static String trueWayTwo(int way) {
        String result = "";
        if (way == 1) {
            System.out.println("right");
        } else if (way == 2) {
            System.out.println("left");
        } else if (way == 3) {
            System.out.println("straight");
        } else {

        }
        return result;
    }
}
