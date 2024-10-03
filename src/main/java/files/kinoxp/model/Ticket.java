package files.kinoxp.model;

import jakarta.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketID;
    private int ticketPrice;
    private int reservationFee;
    @OneToOne
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

}
