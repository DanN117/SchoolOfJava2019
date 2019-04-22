package com.endava.s05e01.repository;

import com.endava.s05e01.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import static java.sql.Types.NULL;

@Repository
public class MovieRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public int add(Movie movie) {
//        int id = getMaxId();
        int id;
        if (getMaxId() != NULL) {
            id = getMaxId() + 1;
        }


        movie.setId(1);


        String query  = "INSERT into movie values (?,?,?)";

        return jdbcTemplate.update(query, movie.getId(), movie.getTitle(), movie.getGenre());
    }

    public int getMaxId() {
        String query = "SELECT MAX(id) from movie";

        return jdbcTemplate.queryForObject(query, Integer.class);
    }

    public int delete(int id) {
        String query = "DELETE from movie where id = ?";
        return jdbcTemplate.update(query, id);
    }
}
