package files.kinoxp.service;

import files.kinoxp.model.Movie;
import files.kinoxp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // THIS IS A DEPENDENCY INJECTION AS AN ALTERNATIVE TO @AUTOWIRED
    /*    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }*/

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

    public Optional<Movie> findByID(int id) {
        return movieRepository.findById(id);
    }
}
