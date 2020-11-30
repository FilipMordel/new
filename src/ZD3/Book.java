package ZD3;

import ZD2.User;

public class Book {

    private int id;
    private String title;
    private boolean available;
    private String author;
    private ZD2.Author[] additionalAuthors;
    private User currentUser;
    private int popularity;


    public Book(int id, String title, String author, int popularity){
        this.id= id;
        this.title= title;
        this.author= author;
        this.popularity= popularity;
    }




    public void setPopularity(){
        this.popularity++;
    }
}

