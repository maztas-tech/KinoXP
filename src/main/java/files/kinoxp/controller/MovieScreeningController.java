package files.kinoxp.controller;

import files.kinoxp.model.MovieScreening;
import files.kinoxp.service.MovieScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class MovieScreeningController {

    @Autowired
    private MovieScreeningService movieScreeningService;

    @PostMapping("/saveMovieScreening")
    @ResponseStatus(HttpStatus.CREATED)
    public MovieScreening createMovieScreening(@RequestBody MovieScreening movieScreening) {
        return movieScreeningService.createMovieScreening(movieScreening);
    }

    @GetMapping("/movieScreenings")
    public List<MovieScreening> movieScreenings(){
        return movieScreeningService.getMovieScreenings();
    }

    @DeleteMapping("deleteMovieScreening/{id}")
    public ResponseEntity<HttpStatus> deleteMovieScreening(@PathVariable int id){
        return movieScreeningService.deleteMovieScreening(id);
    }

    @PutMapping("updateMovieScreening")
    public ResponseEntity<MovieScreening> updateMovieScreening(@RequestBody MovieScreening movieScreening){
        return movieScreeningService.updateMovieScreening(movieScreening, movieScreening.getMovieScreeningID());

    }

}

