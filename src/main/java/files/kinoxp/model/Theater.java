package files.kinoxp.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theaterNum;
    private String theaterName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "theater")
    private List<MovieScreening> movieScreenings;

    public Theater(String theaterName) {
        this.theaterName = theaterName;
    }

    public Theater() {}


    public int getTheaterNum() {
        return theaterNum;
    }

    public void setTheaterNum(int theaterNum) {
        this.theaterNum = theaterNum;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }


    public List<MovieScreening> getMovieScreenings() {
        return movieScreenings;
    }

    public void setMovieScreenings(List<MovieScreening> movieScreenings) {
        this.movieScreenings = movieScreenings;
    }
}
