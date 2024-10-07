package files.kinoxp.controller;

import files.kinoxp.model.Movie;
import files.kinoxp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/saveMovie")
    @ResponseStatus(HttpStatus.CREATED)
    public void createMovie(@RequestBody Movie movie) {
        movieService.createMovie(movie);
    }

    @GetMapping("/movies")
    public List<Movie> movies(){
        return movieService.getMovies();
    }
    @DeleteMapping("/deleteMovie")
    public void deleteMovie(@RequestBody Movie movie) {
        movieService.deleteMovie(movie.getMovieID());
    }

    @PutMapping("/updateMovie")
    public void updateMovie(@RequestBody Movie movie){
        movieService.updateMovie(movie.getMovieID(), movie);
    }


}
