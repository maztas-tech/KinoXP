package files.kinoxp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reservationID;
    private String reservationName;
    private LocalDate reservationDate;
    @OneToMany(mappedBy = "reservation")
    @JsonBackReference
    private Set<Ticket> tickets = new HashSet<>();
    @OneToMany(mappedBy = "reservation")
    @JsonBackReference
    private Set<Employee> employees = new HashSet<>();
}
