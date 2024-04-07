package TA6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void addOnePage() {
        Book book = new Book(42,"Harry Potter","Mr Yakov",400);
        book.addOnePage();
        assertEquals(401,book.getNumOfPages());
    }

    @Test
    void counter() {
        Book book1 = new Book(42,"Harry Potter","Mr Yakov",400);
        Book book2 = new Book(42,"Harry Potter","Mr Yakov",400);
        assertEquals(2, Book.getCounter());
    }
}