package lesson15;

public class Exercise12 {
    public static void main(String[] args) {
       /* printLineNtimes("hello", 3);
        System.out.println();
        printLineNtimes("java", 5);
        System.out.println();
        System.out.println(printLineNtimes2("Frontend", 2));*/
       // countdown(5); // -> 5 4 3 2 1 start

        System.out.println(digitPowTwo(5)); //-> 25
        System.out.println(digitPowTwo(10)); //-> 100 
        System.out.println(digitPowTwo(4));// -> 16
    }
    
    public static int digitPowTwo(int number){
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + number;
        }
        return result;
    }
    

    public static void countdown(int number){
        for (int i = number; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("start");
    }


    public static void printLineNtimes(String word, int number) {
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.print(word + " ");
        }
    }

    public static String printLineNtimes2(String word, int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result = result + word + " ";
        }
        return result;
    }
}
