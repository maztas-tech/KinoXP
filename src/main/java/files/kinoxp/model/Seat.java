package files.kinoxp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import files.kinoxp.model.enums.SeatType;
import jakarta.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seatID;
    private int seatNumber;
    private SeatType seatType;
    private int seatRow;
    private int seatPrice;
    @ManyToOne
    @JoinColumn(name = "theaterFK", referencedColumnName = "theaterNum")
    @JsonBackReference
    private Theater theater;


    public Seat(int seatID, int seatNumber, SeatType seatType, int seatRow, int seatPrice, Theater theater) {
        this.seatID = seatID;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.seatRow = seatRow;
        this.seatPrice = seatPrice;
        this.theater = theater;
    }

    public Seat() {

    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
}
