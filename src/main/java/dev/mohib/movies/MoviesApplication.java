package dev.mohib.movies;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

    public static void main(String[] args) {
        // Load environment variables from .env file
        Dotenv dotenv = Dotenv.load();

        System.setProperty("server.port", dotenv.get("SERVER_PORT"));
        System.setProperty("spring.data.mongodb.uri", dotenv.get("DATABASE_URL"));
        System.setProperty("spring.data.mongodb.database", "movies-api-dbs");
        SpringApplication.run(MoviesApplication.class, args);
    }
    
    @GetMapping("/")
    public String apiRoot() {
        return "Hello World";
    }

}
