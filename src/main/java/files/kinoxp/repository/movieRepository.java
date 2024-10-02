package files.kinoxp.repository;

import files.kinoxp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<Movie,Integer> {

}
