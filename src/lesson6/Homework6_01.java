package lesson6;

public class Homework6_01 {
    public static void main(String[] args) {
        //5 покупателей: 10 лет, 17 лет, 18 лет, 20 лет и 30 лет
        int client1 = 10;
        int client2 = 17;
        int client3 = 18;
        int client4 = 20;
        int client5 = 30;

        System.out.println(alcoholShop(client1));
        // System.out.println(alcoholShopSmart(client1));
    }

    public static String alcoholShop(int age) {
        String alcohol = "";

        switch (age) {
            case 10:
            case 17:
                alcohol = "Not allowed to buy the alcohol";
                break;

            case 18:
            case 20:
            case 30:
                alcohol = "Allowed to buy the alcohol";
                break;
        }

        return alcohol;

    }

    public static String alcoholShopSmart(int age) {
        boolean allowed = age > 18;

        String alcohol = "";

        if (allowed) {
            alcohol = "You are allowed to drink alcohol";
        } else {
            alcohol = "You are not allowed to drink alcohol";
        }
        return alcohol;
    }
}
