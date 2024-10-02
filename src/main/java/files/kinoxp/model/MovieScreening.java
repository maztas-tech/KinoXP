package files.kinoxp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MovieScreening {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieScreeningID;
    private boolean is3D;
    private LocalDate movieDate;
    private LocalTime movieTime;
    private int moviePrice;
    @ManyToOne
    @JoinColumn(name="theaterNumberFK", referencedColumnName = "theaterNumber")
    private Theater theater;

    @OneToMany(mappedBy = "movieScreening")
    @JsonBackReference
    private Set<Movie> movies = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="employeeIDFK", referencedColumnName = "employeeID")
    private Employee employee;

    @OneToMany(mappedBy = "movieScreening")
    @JsonBackReference
    private Set<Ticket> tickets = new HashSet<>();
}
