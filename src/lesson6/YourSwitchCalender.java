package lesson6;

public class YourSwitchCalender {
    public static void main(String[] args) {
        String month = "January";
        String month1 = "JANUARY";
        String month2 = "january";
        System.out.println(stringToIntMonthsNumber(month));
    }

    public static int stringToIntMonthsNumber(String month) {
        month = month.toLowerCase();
        System.out.println("Checking the Number -\t" + month);
        int monthsNumber = 0;
        switch (month) {
            case "january":
                monthsNumber = 1;
                break;
            case "February":
                monthsNumber = 2;
                break;
            case "March":
                monthsNumber = 3;
                break;
            case "April":
                monthsNumber = 4;
                break;
            case "May":
                monthsNumber = 5;
                break;
            case "June":
                monthsNumber = 6;
                break;
            case "July":
                monthsNumber = 7;
                break;
            case "August":
                monthsNumber = 8;
                break;
            case "September":
                monthsNumber = 9;
                break;
            case "October":
                monthsNumber = 10;
                break;
            case "November":
                monthsNumber = 11;
                break;
            case "December":
                monthsNumber = 12;
                break;

            default:
                monthsNumber = -1;
                break;
        }

        return monthsNumber;

    }
}
