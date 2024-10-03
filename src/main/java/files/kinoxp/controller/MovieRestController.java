package files.kinoxp.controller;

import files.kinoxp.model.Movie;
import files.kinoxp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class MovieRestController {

    @Autowired
    MovieService movieService;


    @DeleteMapping("/movie/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable int id) {
        Optional<Movie> movies = movieService.findByID(id);
        if (movies.isPresent()) {
            movieService.deleteMovie(id);
            return ResponseEntity.status(HttpStatus.OK).body("The movie has been deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The movie doesn't exist");
        }
    }
}
