package files.kinoxp.controller;

import files.kinoxp.model.Movie;
import files.kinoxp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/saveMovie")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        if (movieService.createMovie(movie) != null){
            return new ResponseEntity<>(movie, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/movies")
    public List<Movie> movies(){
        return movieService.getMovies();
    }

    @DeleteMapping("/deleteMovie/{movieID}")
    public ResponseEntity<String> deleteMovie(@PathVariable int movieID) {
        return movieService.deleteMovie(movieID);
    }

    /*@DeleteMapping("/deleteMovie/{movieID}")
    public ResponseEntity<HttpStatus> deleteMovie(@PathVariable int movieID) {
        return movieService.deleteMovie(movieID);
    }

     */

    /*@DeleteMapping("/deleteMovie")
    public void deleteMovie(@RequestBody Movie movie) {
        movieService.deleteMovie(movie.getMovieID());
    }

     */

    @PutMapping("/updateMovie")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie){
        return movieService.updateMovie2(movie.getMovieID(), movie);
    }


}
