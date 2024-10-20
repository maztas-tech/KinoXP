package files.kinoxp.config;

import files.kinoxp.model.Theater;
import files.kinoxp.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TheaterInitConfiguration {

    @Autowired
    private TheaterRepository theaterRepository;

    public void createTheater() {

        if (theaterRepository.count() == 0) {
            theaterRepository.save(new Theater("Sal 1"));
            theaterRepository.save(new Theater("Sal 2"));
            System.out.println("Theaters successfully been created");
        }
        else {
            System.out.println("There is already a theater");
        }

    }
}
