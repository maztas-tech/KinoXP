package files.kinoxp.config;

import files.kinoxp.model.Seat;
import files.kinoxp.model.enums.SeatType;
import files.kinoxp.repository.SeatRepository;
import files.kinoxp.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeatConfiguration implements CommandLineRunner {

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    TheaterInitConfiguration theaterInitConfiguration;

    @Override
    public void run(String... args) throws Exception {

        theaterInitConfiguration.run();

        if (seatRepository.count() == 0){
            int countRow;
            int iteration = 0;
            int iteration2 = 0;

            for (int i = 0; i < 24; i++) {
                Seat seat = new Seat();
                seat.setSeatNumber(1+i);
                countRow = iteration / 12 + 1;
                seat.setSeatRow(countRow);
                seat.setSeatType(SeatType.cowboySeats);
                seat.setSeatPrice(-10);
                if (theaterRepository.findById(1).isPresent()){
                    seat.setTheater(theaterRepository.findById(1).get());
                }
                iteration++;
                seatRepository.save(seat);
            }

            for (int i = 0; i < 216; i++) {
                Seat seat = new Seat();
                seat.setSeatNumber(i+25);
                countRow = iteration / 12 + 1;
                seat.setSeatRow(countRow);
                seat.setSeatType(SeatType.regularSeats);
                seat.setSeatPrice(0);
                if (theaterRepository.findById(1).isPresent()){
                    seat.setTheater(theaterRepository.findById(1).get());
                }
                iteration++;
                seatRepository.save(seat);
            }

            for (int i = 0; i < 32; i++) {
                countRow = iteration2 / 16 + 1;
                Seat seat = new Seat();
                seat.setSeatNumber(i + 1);
                seat.setSeatRow(countRow);
                seat.setSeatType(SeatType.cowboySeats);
                seat.setSeatPrice(-10);
                if (theaterRepository.findById(1).isPresent()){
                    seat.setTheater(theaterRepository.findById(2).get());
                }
                iteration2++;
                seatRepository.save(seat);
            }
            for (int i = 0; i < 336; i++) {
                countRow = iteration2 / 16 + 1;
                Seat seat = new Seat();
                seat.setSeatNumber(i+33);
                seat.setSeatRow(countRow);
                seat.setSeatType(SeatType.regularSeats);
                seat.setSeatPrice(0);
                if (theaterRepository.findById(1).isPresent()){
                    seat.setTheater(theaterRepository.findById(2).get());
                }
                iteration2++;
                seatRepository.save(seat);
            }

            for (int i = 0; i < 32; i++) {
                countRow = iteration2 / 16 + 1;
                Seat seat = new Seat();
                seat.setSeatNumber(i+369);
                seat.setSeatRow(countRow);
                seat.setSeatType(SeatType.leatherSeats);
                seat.setSeatPrice(+10);
                if (theaterRepository.findById(1).isPresent()){
                    seat.setTheater(theaterRepository.findById(2).get());
                }
                iteration2++;
                seatRepository.save(seat);
            }
        }
    }
}
