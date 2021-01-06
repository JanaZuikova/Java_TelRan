package lesson4;

import javax.print.DocFlavor;

public class Buttons_Fields {
    public static void main(String[] args) {
        System.out.println(helloName("Bob")); // "Hello Bob!"
        System.out.println(helloName("Alice")); // "Hello Alice!"
        System.out.println(helloName("X")); //  "Hello X!"
    }

    public static String helloName (String name){
        // String result = "";
        String hello = "Hello ";
        String lastSymbpl = "!";
        char myLastSymbol = '!';
        String result = hello + name +  " " + myLastSymbol;
        return result;

    }
}