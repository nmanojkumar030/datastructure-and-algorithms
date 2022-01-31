package pattern.magicallookups;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class BooksWithAuthors {

    // Time Complexity O(N + M), N - Books and M - Authors, Space Complexity O(M)
    public Map<String, String> connectHashTable(List<Book> books, List<Author> authors) {
        Map<String, String> bookAuthorMap = new HashMap<>();
        Map<String, String> authorsMap = authors.stream().collect(toMap(author -> author.getAuthorId(), author -> author.getAuthorName()));
        for (Book book : books) {
            bookAuthorMap.put(book.getTitle(), authorsMap.get(book.getAuthorId()));
        }
        return bookAuthorMap;
    }

    // Time Complexity O(N*M), N - Books and M - Authors
    public Map<String, String> connectBruteForce(List<Book> books, List<Author> authors) {
        Map<String, String> bookAuthorMap = new HashMap<>();
        for (Book book : books) {
            for (Author author : authors) {
                if (book.getAuthorId().equalsIgnoreCase(author.getAuthorId())) {
                    bookAuthorMap.put(book.getTitle(), author.getAuthorId());
                    break;
                }
            }
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
