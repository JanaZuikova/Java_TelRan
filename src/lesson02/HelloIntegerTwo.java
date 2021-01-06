package lesson02;

    public class HelloIntegerTwo {
        public static void main(String[] args) {
            // helloInt();
            // helloByte();
            // helloShort();
            // magicNumber();
        }

        public static void helloShort() {
            short a = 3423;
            short b = 27345;
            short c = (short) (a + b);
        }

        public static void helloByte(){
            byte a = 10;
            byte b = 20;
            byte c =(byte) (a + b);
            byte d = 120;
            byte f = 10;
            byte e = (byte) (d + f); // mistake
            System.out.println(e);
        }

        public static void helloInt () {
            int a = 6;
            System.out.println(" expecting six:\t" + a);
            int b = 3;
            System.out.println(a + b); // 14
            System.out.println(a * b); // 45
            System.out.println(a / b); // 2.8 ; 3;
            System.out.println(a - b); // 4

        }

}
