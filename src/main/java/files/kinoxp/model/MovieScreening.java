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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public int getMovieScreeningID() {
        return movieScreeningID;
    }

    public void setMovieScreeningID(int movieScreeningID) {
        this.movieScreeningID = movieScreeningID;
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

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
