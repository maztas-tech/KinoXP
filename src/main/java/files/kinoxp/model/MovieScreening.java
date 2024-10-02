package files.kinoxp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

public class MovieScreening {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieScreeningID;
    private boolean is3D;
    private LocalDate movieDate;
    private LocalTime movieTime;
    private int moviePrice;
}
