package lesson18;

public class ArrayIntro {
    public static void main(String[] args) {
        // introOne();
        // introOld();
        // arrayDeclarationAndInitialization();
        // germanCitiesExample();
        anotherExample();

    }

    private static void anotherExample() {
        String hm = "Vasilij";
        String gubernatr = "Schwarzeneger";
        String[] people = new String[]{hm, gubernatr};

        int result = 0;
        for (int i = 0; i < people.length; i++) {
        result = result + people[i].length();
        }
        System.out.println(result);
    }

    private static void germanCitiesExample() {
        String[] germanCities = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Düsseldorf"};
        int allGermanCitiesLenght = 0;
        int allGermanCities = germanCities.length;
        System.out.println(allGermanCities);
        for (int i = 0; i < germanCities.length; i++) {
            allGermanCitiesLenght = allGermanCitiesLenght + germanCities[i].length();
        }
        System.out.println(allGermanCitiesLenght);
    }

    private static void arrayDeclarationAndInitialization() {
        // new tip dannyh
        int[] justExample = new int[10];
        int[] justExampleTwo;
        justExampleTwo = new int[1001];
        int[] field = new int[]{10, 15, 3, 7, 4, 9, 8};
        int[] numberFibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String[] germanCities = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Düsseldorf"};

        String[] fourSeasons = new String[]{"Vivaldi", "Chajkovski", "Steven King", "Hotel"};
    }


    private static void introOne() {
        int[] myArray;
        String[] user;
        double[] truthTable;
        char[] cyrillicAlphabet;
    }


    private static void introOld() {
        int myArray[];
        String user[];
        double truthTable[];
        char cyrillicAlphabet[];

    }


}
