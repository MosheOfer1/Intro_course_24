package TA6;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(75, "Harry Potter", "J.K Rowling", 361);
        Book book2 = new Book(75, "Harry Potter 2", "J.K Rowling", 500);
        Book book3 = book1;
        book1.addOnePage();
        System.out.println(book1);
        System.out.println(book2);
        book1.setPrice(80);
        System.out.println(book3.getPrice());
    }
}
