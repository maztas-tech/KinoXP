package files.kinoxp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import files.kinoxp.model.enums.MovieGenre;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieID;
    private String movieTitle;
    private int movieLength;
    private MovieGenre movieGenre;
    @ManyToOne
    @JoinColumn(name = "movieScreeningIDFK",referencedColumnName = "movieScreeningID")
    private MovieScreening movieScreening;

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public MovieScreening getMovieScreening() {
        return movieScreening;
    }

    public void setMovieScreening(MovieScreening movieScreening) {
        this.movieScreening = movieScreening;
    }
}
