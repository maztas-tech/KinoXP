package files.kinoxp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int theaterNumber;
    private String theaterName;
    private int theaterCapacity;
}
