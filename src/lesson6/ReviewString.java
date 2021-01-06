package lesson6;

public class ReviewString {
    public static void main(String[] args) {
        String title = "Ja pamjatnik vozdvig sebe ne rukotvornyj";
        String newTitle = title.toUpperCase();
        System.out.println(newTitle);
        newTitle = newTitle.substring(0,1).toUpperCase() + newTitle.substring(1).toLowerCase();
        System.out.println(newTitle);

    }
}
