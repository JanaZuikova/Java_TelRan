package lesson4;

import javax.print.DocFlavor;

public class Homework4_02 {
    public static void main(String[] args) {
        yourData();
    }

    public static void yourData() {
        String yourName = "Jana";
        String surname = "Zuikova";
        String age = "25";
        String adress = "My Adress";
        String user = yourName + " " + surname + " " + adress;
        System.out.println("User name:\t" + yourName);
        System.out.println("User surname:\t" + surname);
        System.out.println("User age:\t" + age);
        System.out.println("User Adress:\t" + adress);
        System.out.println("User Data:\t" + user);
    }
}
