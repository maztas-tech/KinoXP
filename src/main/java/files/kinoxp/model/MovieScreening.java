package files.kinoxp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

@Entity
public class MovieScreening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieScreeningID;
    private String movieScreeningTitle;
    private boolean is3D;
    private LocalDate movieDate;
    private LocalTime movieTime;
    private int moviePrice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movieScreening")
    @JsonBackReference
    private Collection<Movie> movieCollections;



    public int getMovieScreeningID() {
        return movieScreeningID;
    }

    public void setMovieScreeningID(int movieScreeningID) {
        this.movieScreeningID = movieScreeningID;
    }

    public String getMovieScreeningTitle() {
        return movieScreeningTitle;
    }

    public void setMovieScreeningTitle(String movieScreeningTitle) {
        this.movieScreeningTitle = movieScreeningTitle;
    }

    public boolean isIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public LocalDate getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(LocalDate movieDate) {
        this.movieDate = movieDate;
    }

    public LocalTime getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(LocalTime movieTime) {
        this.movieTime = movieTime;
    }

    public int getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        this.moviePrice = moviePrice;
    }

    public Collection<Movie> getMovieCollections() {
        return movieCollections;
    }

    public void setMovieCollections(Collection<Movie> movieCollections) {
        this.movieCollections = movieCollections;
    }
}
