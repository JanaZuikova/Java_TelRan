package lesson02;

public class HomeWork4 {
    public static void main(String[] args){
        grains();
    }

    public static void grains() {
        int n = 5;

        Long counter = 0L;
        Long prev = 1L;

        for(int i=0; i<(n*n); i++) {
            counter += prev * 2;
            System.out.println(prev);
            prev *= 2;
        }
        // 33082375
        System.out.print("The total number of grains is:\t"+counter);
    }
}
