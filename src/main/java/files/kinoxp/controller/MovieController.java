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
    @DeleteMapping("/deleteMovie/{id}")
    public void deleteMovie(@PathVariable int id){
        movieService.deleteMovie(id);
    }

    @PutMapping("/updateMovie/{id}")
    public void updateMovie(@PathVariable int id, @RequestBody Movie movie){
        movieService.updateMovie(id,movie);
    }


}
