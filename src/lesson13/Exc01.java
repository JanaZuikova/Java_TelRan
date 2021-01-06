package lesson13;

public class Exc01 {
    public static void main(String[] args) {
       costOfElectricity(300);//70
       costOfElectricity(90);//30
    }
    private static void costOfElectricity(int kvt) {
        // dano 1 kv = 0,2;
        // months = 30
        // 100 KV
        double monthCost = 30;
        if (kvt > 100) {
            monthCost += (kvt - 100) * 0.2;
        }
        System.out.println(monthCost);
    }
}
