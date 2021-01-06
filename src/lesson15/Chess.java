package lesson15;

public class Chess {
    public static void main(String[] args) {
        chess(8);
        // multiplyTable(10);
    }

    private static void multiplyTable(int lines) {
        // 1. nado narisovatj kvardart ( tablica soderzhymogo)
        // 2. najti chto tam nahoditsja ( sdlatj soderzhimoe, proizvedenie)
        // 3. otformatirovatj
        // 4.
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    private static void chess(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                String place = formatChess(i, j);
                System.out.print(place);
            }
            System.out.println();
        }
    }

    private static String formatChess(int i, int j) {
        String result = "";
        String star = "*";
        String minus = "-";
        if (i % 2 != 0 && j % 2 != 0) {
            result = star;
        } else if (i % 2 == 0 && j % 2 == 0) {
            result = star;
        } else {
            result = minus;
        }

        return result;
    }
}

