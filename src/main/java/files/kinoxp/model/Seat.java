package files.kinoxp.model;

import files.kinoxp.model.enums.SeatType;
import jakarta.persistence.*;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seatID;
    private int seatNumber;
    private SeatType seatType;
    private int row;
    private int seatPrice;
    @ManyToOne
    @JoinColumn(name = "theaterNumberFK",referencedColumnName = "theaterNumber")
    private Theater theater;

}
