package lesson7;

public class HelloZina {
    public static void main(String[] args) {
        System.out.println(salePermission(10));

    }

    public static void salePermission2(int age) {
        if (age < 16) {
            System.out.println("Too young");
        } else if (age >= 16 && age < 18) {
            System.out.println("You can sell the beer!");
        }else if (age < 21){
            System.out.println("Accept wodka");
        } else {
            System.out.println("You can sell everything");
        }
    }


    public static String salePermission(int age) {
        String result = "";
        if (age > 18) {
            result = "You can sell the alcohol!";
        } else {
            result = "Not allowed!";
        }
        return result;
    }
}