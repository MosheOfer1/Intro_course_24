package TA6;

public class Book {
    // Data members
    private int price;
    private String title;
    private String author;
    private int numOfPages;
    private static int counter = 0;

    // Constructor
    public Book(int price, String title, String author, int numOfPages) {
        this.price = price;
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
        counter++;
    }

    // Getters & Setters
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    // Methods
    public void addOnePage() {
        this.numOfPages++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "\ntitle = '" + title + '\'' +
                "\nauthor = '" + author + '\'' +
                "\nprice = " + price +
                "\nnumOfPages = " + numOfPages + "\n";
    }
}
