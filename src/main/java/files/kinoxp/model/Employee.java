package files.kinoxp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeID;
    private String employeeName;
    private String employeeUsername;
    private String employeePassword;
    @ManyToOne
    @JoinColumn(name = "roleIDFK", referencedColumnName = "roleID")
    private Role role;
    @OneToMany(mappedBy = "employee")
    @JsonBackReference
    private Set<MovieScreening> movieScreeningSet = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "reservationIDFK",referencedColumnName = "reservationID")
    private Reservation reservation;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<MovieScreening> getMovieScreeningSet() {
        return movieScreeningSet;
    }

    public void setMovieScreeningSet(Set<MovieScreening> movieScreeningSet) {
        this.movieScreeningSet = movieScreeningSet;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
