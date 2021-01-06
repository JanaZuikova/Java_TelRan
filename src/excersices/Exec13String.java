package excersices;

public class Exec13String {
    public static void main(String[] args) {
       /* System.out.println(nonStart("Hello", "There")); // → "ellohere"
        System.out.println(nonStart("java", "code")); // → "avaode"
        System.out.println(nonStart("shotl", "java")); // → "hotlava"
        System.out.println(nonStart("Tel-Ran", "")); // → "Error"*/

        System.out.println(theEnd("Hello", true)); //→ "H"
        System.out.println(theEnd("Hello", false)); //→ "o"
        System.out.println(theEnd("oh", true)); // → "o"
    }

    private static String theEnd(String word, boolean b) {
        String output = "";
        // if b = true, then return the first letter else if return the last
        if (b) { // b = true
            //  return word.substring(0,1);
            output = word.substring(0, 1);
        } else {
            // return word.substring(word.length() -1);
            output = word.substring(word.length() - 1);
        }

        return output;
    }

    private static String nonStart(String str1, String str2) {
        return str1.substring(1) + str2.substring(1);
    }


}
