package dev.mohib.movies.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Data //Auto generate getters and setters
@AllArgsConstructor //Auto generates Constructor with All Arguments
@NoArgsConstructor //Auto generates Constructor with No Arguments
public class Book {
    @Id
    private String id;
    private String title;
    private String author;

    // Constructors, getters, setters
}

