package lesson3;

public class HomeWork3_04 {
    public static void main(String[] args) {
   double myRelation = exercise04();
        System.out.println(myRelation);
        System.out.println(exercise4AnotherTime(234322, 3245));
        System.out.println(exercise4AnotherTime(3423, 234234));
    }
    public static double exercise4AnotherTime(double firstSquare, double secondSquare){

        double squareRelations = firstSquare / secondSquare;
        return squareRelations;

    }

    public static double exercise04(){
        // najti sootnoshenia plowadi Belarus r plowadi ukraina
        // B - 207,595 km
        // U - 603,628 km
        double belarusSquare = 207.595;
        double ukraineSquare = 603.628;

        double relation = belarusSquare / ukraineSquare;
        System.out.println("Sootnowenie plowadi dvuh stran \t " + relation);
        return belarusSquare;
    }

}
