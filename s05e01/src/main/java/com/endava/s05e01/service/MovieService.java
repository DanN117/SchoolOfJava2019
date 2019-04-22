package com.endava.s05e01.service;

import com.endava.s05e01.model.Movie;
import com.endava.s05e01.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public int add(String title, String genre) {
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);

        movieRepository.add(movie);

        return 0; //#//
    }

    public void delete(int id) {
        movieRepository.delete(id);
    }
}
