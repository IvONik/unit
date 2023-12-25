package HW4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class BookServiceTest {

    @Test
    void findBookById() {
        // Создаем мок BookRepository
        BookRepository bookRepository = mock(BookRepository.class);

        // Создаем тестовую книгу
        String idBook = "1";
        String nameBook = "Book1";
        String author = "Author1";
        Book testBook = new Book(idBook, nameBook, author);

        // Указываем, что при вызове метода findById с аргументом idBook будет возвращена тестовая книга
        when(bookRepository.findById(idBook)).thenReturn(testBook);

        // Создаем экземпляр BookService, передавая мок BookRepository
        BookService bookService = new BookService(bookRepository);

        // Вызываем метод findBookById
        Book foundBook = bookService.findBookById(idBook);

        // Проверяем, что возвращенная книга соответствует тестовой книге
        assertEquals(testBook, foundBook);

        // Проверяем, что метод findById был вызван ровно один раз с аргументом "1"
        verify(bookRepository, times(1)).findById(idBook);
    }

    @Test
    void findAllBooks() {
        // создаем заглушку bookRepository в виде mock объекта
        BookRepository bookRepository = mock(BookRepository.class);

        // Создаем тестовые книги
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        // указываем, что пр вызове метода будет возвращен наш список
        when(bookRepository.findAll()).thenReturn(books);

        // создаем экземпляр BookService
        BookService bookService = new BookService(bookRepository);

        // вызываем метод и сравниваем результаты
        List<Book> foundBooks = bookService.findAllBooks();

        verify(bookRepository, times(1)).findAll();

    }
}