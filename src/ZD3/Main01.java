package ZD3;

public class Main01 {
    public static void main(String[] args) {
        Book book = new Book(1,"Ferdy", "Nowooo", 1 );
        if(book.equals(book)){
            System.out.println("Są równe");
        }

    }
}
