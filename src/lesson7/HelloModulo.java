package lesson7;

public class HelloModulo {
    public static void main(String[] args) {
        int a= 7 % 4;
        int b = 7 / 4;
        System.out.println(a);
        System.out.println(b);

        if(a%2==0){
            System.out.println("Chjotnoe number");
        }else {
            System.out.println("Nechjotnoe");
        }
    }
}
