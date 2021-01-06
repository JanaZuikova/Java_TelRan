package lesson6;

public class Homework6_02 {
    public static void main(String[] args) {
        // Напишите программу, которая определяет сезон года. Месяца указаны int переменными.
        System.out.println("The month 1 is in season: " + seasonName(1));
        System.out.println("The month 2 is in season: " + seasonName(2));
        System.out.println("The month 3 is in season: " + seasonName(3));
        System.out.println("The month 4 is in season: " + seasonName(4));
        System.out.println("The month 5 is in season: " + seasonName(5));
        System.out.println("The month 6 is in season: " + seasonName(6));
        System.out.println("The month 7 is in season: " + seasonName(7));
        System.out.println("The month 8 is in season: " + seasonName(8));
        System.out.println("The month 9 is in season: " + seasonName(9));
        System.out.println("The month 10 is in season: " + seasonName(10));
        System.out.println("The month 11 is in season: " + seasonName(11));
        System.out.println("The month 12 is in season: " + seasonName(12));

    }

    public static String seasonName(int month) {
        String season = "";
        switch (month) {

            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;

            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;

            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;

            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;

            default:
                season = "Not found";
                break;
        }

        return season;

    }
}
