package ZD2;

public class Book {
    private int id;
    private String title;
    private boolean available;
    private Author author;
    private Author [] additionalAuthors;
    private User currentUser;

    public Book(int id, String title, Author author){
        this.id= id;
        this.title= title;
        this.author= author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        available = false;
      //  currentUser.addBook(this);
    }
}
