package lesson18;

public class Excer1_MinCut {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));// → "loHi"
        System.out.println(minCat("Hello", "java"));// → "ellojava"
        System.out.println(minCat("java", "Hello"));// → "javaello"
        System.out.println(minCat("java", ""));// → "javaello"
        intReview();
    }

    public static void intReview() {
        int a1 = 5;
        int b1 = 10;
        int minLenghtString = Math.min(a1, b1);
       /* if( a1 > b1){
            minLenghtString = b1;
        }else {
            minLenghtString = a1;
        } */
    }

    private static String minCat(String a, String b) {
        int minLenghtString = Math.min(a.length(), b.length());
        String first = a.substring(a.length() - minLenghtString);
        String second = b.substring((b.length() - minLenghtString));

        return first + second;
    }
}
