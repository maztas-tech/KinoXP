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
}
