package files.kinoxp.model;

import jakarta.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketID;
    private int ticketPrice;
    private int reservationFee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seatIDFK", referencedColumnName = "seatID")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "reservationIDFK", referencedColumnName = "reservationID")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "customerIDFK", referencedColumnName = "customerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "theaterNumberFK", referencedColumnName = "theaterNumber")
    private Theater theater;

    @ManyToOne
    @JoinColumn(name = "movieScreeningIDFK", referencedColumnName = "movieScreeningID")
    private MovieScreening movieScreening;


    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getReservationFee() {
        return reservationFee;
    }

    public void setReservationFee(int reservationFee) {
        this.reservationFee = reservationFee;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public MovieScreening getMovieScreening() {
        return movieScreening;
    }

    public void setMovieScreening(MovieScreening movieScreening) {
        this.movieScreening = movieScreening;
    }
}
