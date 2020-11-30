package ZD3;

import ZD2.Book;

import java.util.Arrays;



    public class User {
        private int id;
        private String firstName;
        private String lastName;
        private ZD2.Book[] books;

        public User(int id, String firstName, String lastName){
            this.id= id;
            this.firstName= firstName;
            this.lastName= lastName;
        }
        public void add (Book book){
            this.books = Arrays.copyOf(books, books.length+1);
            books[books.length-1]= book;
        }
}
