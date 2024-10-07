package files.kinoxp.service;

import files.kinoxp.model.Movie;
import files.kinoxp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Movie createMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }

    public void deleteMovie(int id){
        movieRepository.deleteById(id);
    }

    public void updateMovie(int id, Movie movie){
        Movie newMovie;
        newMovie = movieRepository.findById(id).get();
        newMovie.setMovieTitle(movie.getMovieTitle());
        newMovie.setMovieLength(movie.getMovieLength());
        newMovie.setGenre(movie.getGenre());
        newMovie.setMovieScreening(movie.getMovieScreening());
        movieRepository.save(newMovie);
    }

    public ResponseEntity<Movie> updateMovie2(int id, Movie movie){
        if (movieRepository.findById(id).isPresent()){
            movieRepository.save(movie);
            return ResponseEntity.ok(movie);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
