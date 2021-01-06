package lesson6;

public class MySwitchCalender {
    public static void main(String[] args) {
        int myUnknownMonth = 12;
        System.out.println(intmyUnknownMonth(myUnknownMonth));
        // System.out.println(intmyUnknownMonth(12));

    }

    public static String intmyUnknownMonth(int number) {
        // String output = "";
        // String result = "";
        String monthsName = "";

        switch (number) {
            case 1:
                monthsName = "January";
                break;
            case 2:
                monthsName = "February";
                break;
            case 3:
                monthsName = "March";
                break;
            case 4:
                monthsName = "April";
                break;
            case 5:
                monthsName = "May";
                break;
            case 6:
                monthsName = "June";
                break;
            case 7:
                monthsName = "July";
                break;
            case 8:
                monthsName = "August";
                break;

            case 9:
                monthsName = "September";
                break;
            case 10:
                monthsName = "Oktober";
                break;
            case 11:
                monthsName = "November";
                break;
            case 12:
                monthsName = "December";
                System.out.println("check of December month");
                System.out.println("The most beautiful month of the year");
                break;
            default:
                monthsName = "Do not exist";
                break;

        }

        return monthsName;

    }
}
