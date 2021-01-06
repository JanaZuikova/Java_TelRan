package lesson7;

public class SwitchReview {
    public static void main(String[] args) {
        String uncle = "Uncle Alex";
        int floor = 6;
        System.out.println(elevator(floor));

    }
    public static String elevator(int level){
        String result = "";
    switch (level){
        case 9:
            result = "Floor 9";
        break;

        case 8:
            result = "Floor 8";
        break;

        case 7:
            result = "Floor 7";
        break;

        case 6:
            result = "Floor 6";
        break;

        case 5:
            result = "Floor 5";
        break;

        case 4:
            result = "Floor 4";
        break;

        case 3:
            result = "Floor 3";
        break;

        case 2:
            result = "Floor 2";
        break;

        case 1:
            result = "Floor 1";
        break;

        case 0:
            result = "Floor 0";
        break;

        case -1:
            result = "Floor -1";
        break;
        default:
            result = "This floor does not exist";
        break;


    }
        // System.out.println("Hello, you came to the:  " + result);
    return "\"Hello, you came to the:  \"" + result + "!";
    }

}
