package files.kinoxp.service;

import files.kinoxp.model.MovieScreening;
import files.kinoxp.repository.MovieScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieScreeningService {

    @Autowired
    MovieScreeningRepository movieScreeningRepository;

    public MovieScreening createMovieScreening(MovieScreening movieScreening) {
        return movieScreeningRepository.save(movieScreening);
    }

    public List<MovieScreening> getMovieScreenings() {
        return movieScreeningRepository.findAll();
    }

    public void deleteMovieScreening(int id) {
        movieScreeningRepository.deleteById(id);
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

