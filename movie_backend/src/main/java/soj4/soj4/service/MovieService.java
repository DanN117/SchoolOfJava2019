/*package soj4.soj4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soj4.soj4.model.Movie;
import soj4.soj4.repository.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;



    public int add(String title, String genre) {
        Movie movie=new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);

       return movieRepository.add(movie);

    }

    public int delete(int id) {
       return movieRepository.delete(id);
    }
}
*/