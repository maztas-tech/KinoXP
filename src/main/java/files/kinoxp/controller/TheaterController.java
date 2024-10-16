package files.kinoxp.controller;


import files.kinoxp.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class TheaterController {

    @Autowired
    private TheaterService theaterService;
}
