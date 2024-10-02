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
    @JoinColumn(name = "seatIDFK",referencedColumnName = "seatID")
    private Seat seat;

}
