package les3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void addBook(){
        Library library = new Library();
        Book book = new Book("It", "King");
        library.addBook(book);
        List<Book> myList = library.searchAvailableBooks();
        assertTrue(myList.contains(book));
    }
    @Test
    public void removeBook(){
        Library library = new Library();
        Book book = new Book("It", "King");
        library.addBook(book);
        library.removeBook(book);
        List<Book> myList = library.searchAvailableBooks();
        assertFalse(myList.contains(book));
    }
    @Test
    public void searchBookByAuthor(){
        Library library = new Library();
        Book book1 = new Book("It", "King");
        Book book2 = new Book("Shilling", "King");
        Book book3 = new Book("Ab", "A");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        List<Book> myList1 = library.searchBooksByAuthor("King");
        assertEquals(2, myList1.size());
        assertTrue(myList1.contains((book1)));
        assertTrue(myList1.contains((book2)));

        List<Book> myList2 = library.searchBooksByAuthor("A");
        assertEquals(1, myList2.size());
        assertTrue(myList2.contains((book3)));
    }
    @Test
    public void searchAvailableBooks(){
        Library library = new Library();
        Book book1 = new Book("It", "King");
        Book book2 = new Book("Shilling", "King");
        library.addBook(book1);
        library.addBook(book2);
        List<Book> myList2 = library.searchAvailableBooks();
        assertEquals(2, myList2.size());
    }
    @Test
    public void borrowBook(){
        Library library = new Library();
        Book book1 = new Book("It", "King");
        Book book2 = new Book("Shilling", "King");
        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook((book1));
        List<Book> myList2 = library.searchAvailableBooks();
        assertEquals(1, myList2.size());
    }
    @Test
    public void returnBook(){
        Library library = new Library();
        Book book1 = new Book("It", "King");
        Book book2 = new Book("Shilling", "King");
        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook((book1));
        library.returnBook((book1));
        List<Book> myList2 = library.searchAvailableBooks();
        assertEquals(2, myList2.size());
    }
}