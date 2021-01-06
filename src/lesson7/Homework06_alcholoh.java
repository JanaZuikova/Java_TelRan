package lesson7;

public class Homework06_alcholoh {
    public static void main(String[] args) {
        salePermission(10);
    }

    public static String salePermission(int age){

        String result = "";
        switch (age){
            case 10:
                result = "Alcohol is not allowed!";
                break;
            case 17:
                result = "The soft alcohol is allowed!";
                break;
            case 18:
                result = "Allowed all alcohol accept wodka!";
                break;
            case 20:
            case 30:
                result = "You can buy the alcohol!";
            default:
                result = "Administration calling!!!!!";
                break;

        }
        return result;
    }
}
