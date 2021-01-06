package lesson02;

public class HelloCube {
    public static void main(String[] args) {
        // we have a cube with size 10;
        // najdi plowatj i perimetr;
        // int a = 10;
        findPerimeter();
        findSquare();
    }

    public static void findPerimeter() {

        int a = 10;
        int perimeter = 12 * a;
        System.out.println(" Perimeter of cube is\t" + perimeter);
    }


    public static void findSquare(){
        int a = 10;
        int quadratSquare = a * a;
        int cubeSquare = 6 * quadratSquare;
        System.out.println(" Area of cube = \t" + cubeSquare);

    }

}

