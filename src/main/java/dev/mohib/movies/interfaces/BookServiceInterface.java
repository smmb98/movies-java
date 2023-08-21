package dev.mohib.movies.interfaces;

import dev.mohib.movies.models.Book;

import java.util.List;

public interface BookServiceInterface {
    List<Book> getAllBooks();

    Book getBookById(String id);

    Book createBook(Book book);

    Book updateBook(String id, Book book);

    void deleteBook(String id);
}
