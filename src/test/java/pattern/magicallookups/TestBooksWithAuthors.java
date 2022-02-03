package pattern.magicallookups;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBooksWithAuthors {
    @Test
    public void testConnectBooksWithAuthors() {
        BooksWithAuthors booksWithAuthors = new BooksWithAuthors();

        List<BooksWithAuthors.Author> authors = new ArrayList<>();
        authors.add(new BooksWithAuthors.Author("1", "Virginia Wolf"));
        authors.add(new BooksWithAuthors.Author("2", "Leo Tolstoy"));
        authors.add(new BooksWithAuthors.Author("3", "Dr.Seuss"));

        List<BooksWithAuthors.Book> books = new ArrayList<>();
        books.add(new BooksWithAuthors.Book("1", "Mrs. Dalloway"));
        books.add(new BooksWithAuthors.Book("1", "To the Lighthouse"));
        books.add(new BooksWithAuthors.Book("2", "Anna Karenina"));
        books.add(new BooksWithAuthors.Book("2", "War and Peace"));
        books.add(new BooksWithAuthors.Book("3", "Hop on Pop"));
        books.add(new BooksWithAuthors.Book("3", "Green Eggs and Ham"));

        Map<String, String> booksAuthors = booksWithAuthors.connectHashTable(books, authors);
        assertEquals(6, booksAuthors.size());
    }
}