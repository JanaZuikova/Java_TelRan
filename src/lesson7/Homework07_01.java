package lesson7;

public class Homework07_01 {
    /* программу действий для сотрудника дорожной полиции, который остановил машину:
    -> при езде до 50 км/час нарушений нет;
    -> за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
    -> за превышение скорости от 16 км/час — 40 евро штрафа;
    -> за езду от 100 км/час до 130 км/час — штраф 500 евро;
    -> и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного
       средства.
       0 <=
    */
    public static void main(String[] args) {
        int speed = 67;
        speedControl(speed);
    }

    public static void speedControl(int speed) {
        if (speed <= 50) {
            System.out.println("No rules broken");
        } else if (speed <= 65) {
            System.out.println("Verbal warning and a 5 minutes lecture");
        }else if (speed < 100) {
            System.out.println("You will get a fine in amount of 40 €");
        }else if (speed < 130){
            System.out.println("You will get a fine in amount of 1000 €");
        }else {
            System.out.println("You will lose your driving license");
        }
    }
}
