package files.kinoxp.service;

import files.kinoxp.model.Movie;
import files.kinoxp.model.MovieScreening;
import files.kinoxp.repository.MovieRepository;
import files.kinoxp.repository.MovieScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieScreeningService {

    @Autowired
    MovieScreeningRepository movieScreeningRepository;
    private MovieRepository movieRepository;

    public MovieScreening createMovieScreening(MovieScreening movieScreening) {
        return movieScreeningRepository.save(movieScreening);
    }

    public List<MovieScreening> getMovieScreenings() {
        return movieScreeningRepository.findAll();
    }

    public ResponseEntity<HttpStatus> deleteMovieScreening(int id) {
        if (movieScreeningRepository.findById(id).isPresent()) {
            movieScreeningRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND, HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<MovieScreening> updateMovieScreening(MovieScreening movieScreening, int id) {
        if (movieScreeningRepository.findById(id).isPresent()) {
            movieScreeningRepository.save(movieScreening);
            return ResponseEntity.ok(movieScreening);
        }else {
            return ResponseEntity.notFound().build();
        }


    }
}

