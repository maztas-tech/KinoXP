package files.kinoxp.model;

import files.kinoxp.model.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seatID;
    private int seatNumber;
    private SeatType seatType;
    private int row;
    private int seatPrice;

}
