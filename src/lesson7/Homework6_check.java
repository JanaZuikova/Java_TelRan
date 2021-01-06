package lesson7;

public class Homework6_check {
    public static void main(String[] args) {
        int month = 12;
        System.out.println(findSeason(month));
        // scope -> Oblastj vidimosti

    }

    public static String findSeason(int monthNumber) {
        String season = "";
        switch (monthNumber) {
            case 12:
                season = "Winter";
                break;
            case 11:
                season = "Autumn";
                break;
            case 10:
                season = "Autumn";
                break;
            case 9:
                season = "Autumn";
                break;
            case 8:
                season = "Summer";
                break;
            case 7:
                season = "Summer";
                break;
            case 6:
                season = "Summer";
                break;
            case 5:
                season = "Spring";
                break;
            case 4:
                season = "Spring";
                break;
            case 3:
                season = "Spring";
                break;
            case 2:
                season = "Winter";
                break;
            case 1:
                season = "Winter";
                break;
            default:
                season = monthNumber + "do not exist";

        }
        return season;
    }

}
