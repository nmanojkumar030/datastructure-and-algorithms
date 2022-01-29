package pattern.magicallookups;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class BooksWithAuthors {

    public Map<String, String> connect(List<Book> books, List<Author> authors) {
        Map<String, String> bookAuthorMap = new HashMap<>();
        Map<String, String> authorsMap = authors.stream().collect(toMap(author -> author.getAuthorId(), author -> author.getAuthorName()));
        for (Book book : books) {
            bookAuthorMap.put(book.getTitle(), authorsMap.get(book.getAuthorId()));
        }
        return bookAuthorMap;
    }

    static class Book {
        final private String authorId;
        final private String title;

        public String getAuthorId() {
            return authorId;
        }

        public String getTitle() {
            return title;
        }

        public Book(String authorId, String title) {
            this.authorId = authorId;
            this.title = title;
        }
    }

    static class Author {
        final private String authorId;
        final private String authorName;

        public String getAuthorId() {
            return authorId;
        }

        public String getAuthorName() {
            return authorName;
        }

        public Author(String authorId, String authorName) {
            this.authorId = authorId;
            this.authorName = authorName;
        }
    }
}
