package lesson6;

public class HelloSwitch {
    /*
    For a mark five of an exam in Java bicycle
    For a mark four a new GoPro
    For a mark three no gonna blame
    For a mark two will get anger
    For a mark one "Do not even ask"
     */
    public static void main(String[] args) {
        int scoreVChetverti = 1;
        int score = 3;
       // myFirstSwitch(scoreVChetverti);
       // myFirstSwitch(score);
        System.out.println(myFirstSwitch(5));
    }

    public static String myFirstSwitch(int schoolScore) {
        // operator vybora, kljuchevoe slovo, konstruktr
        String prize = "";
        switch (schoolScore){
            case 1:
                prize = "Do not even ask";
                break;
            case 2: prize = "Will get anger";
                break;
            case 3:
                prize = "Not gonna blame";
                break;
            case 4:
                prize = "Get a new GoPro";
                break;
            case 5:
                prize = "New bicycle";
                break;
            default:
                prize = "This mark does not exist";
                break;

        }
        System.out.println(prize);
        return prize;
    }
}
