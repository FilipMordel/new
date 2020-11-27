package ZD2;

public class Main01 {

    public static void main(String[] args) {
        User user = new User(1, "Jan", "Nowak");
        Author author = new Author(1,"Henryk","Sienkiewicz","Henio");
        Book book = new Book(1, "W pustyni i w puszczy", author);

        Author author2= new Author(2, "Witold", "Gombrowicz", "Witek");
        Book book2 = new Book(2, "Ferdydurke", author2);

//      user.addBook(book);
//      user.addBook(book2);
    }
}