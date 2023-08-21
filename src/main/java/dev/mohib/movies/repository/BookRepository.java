package dev.mohib.movies.repository;

import dev.mohib.movies.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}