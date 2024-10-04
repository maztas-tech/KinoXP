package files.kinoxp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public int getTheaterNumber() {
        return theaterNumber;
    }

    public void setTheaterNumber(int theaterNumber) {
        this.theaterNumber = theaterNumber;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public int getTheaterCapacity() {
        return theaterCapacity;
    }

    public void setTheaterCapacity(int theaterCapacity) {
        this.theaterCapacity = theaterCapacity;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Set<Seat> getSeatset() {
        return seatset;
    }

    public void setSeatset(Set<Seat> seatset) {
        this.seatset = seatset;
    }

    public Set<MovieScreening> getMovieScreeningSet() {
        return movieScreeningSet;
    }

    public void setMovieScreeningSet(Set<MovieScreening> movieScreeningSet) {
        this.movieScreeningSet = movieScreeningSet;
    }
}
