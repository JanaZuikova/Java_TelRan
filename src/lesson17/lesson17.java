package lesson17;

import java.util.Scanner;

public class lesson17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantity;
        System.out.println("Print quantity of voices");
        quantity = input.nextInt();
        if (quantity > 50) {
            System.out.println("Your candidate is president: \n Congratulations");
        }else {
            System.out.println("Your candidate lost");
        }
    }
}
