package files.kinoxp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int theaterNumber;
    private String theaterName;
    private int theaterCapacity;

    @OneToMany(mappedBy = "theater")
    @JsonBackReference
    private Set<Ticket> tickets = new HashSet<>();

    @OneToMany(mappedBy = "theater")
    @JsonBackReference
    private Set<Seat> seatset = new HashSet<>();

    @OneToMany(mappedBy = "theater")
    @JsonBackReference
    private Set<MovieScreening> movieScreeningSet = new HashSet<>();
}
