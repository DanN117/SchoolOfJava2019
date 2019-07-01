/*package soj4.soj4.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import soj4.soj4.model.Movie;

@Repository
public class MovieRepository {
    @Autowired
    //private JdbcTemplate jdbcTemplate;

    public int add(Movie movie) {
        int id=0;
        if(getMaxId()==0)
        {
            id=getMaxId();
        }


        movie.setId(id+1);
        String query = "INSERT into movie values (?,?,?)";
       return jdbcTemplate.update(query, movie.getId(),movie.getTitle(),movie.getGenre() );

    }

    private int getMaxId(){
        String query="SELECT MAX(id) from movie";
        if( jdbcTemplate.queryForObject(query,Integer.class)!=0){
            return  jdbcTemplate.queryForObject(query,Integer.class);
        }else return 0;

    }

    public int delete(int id) {

        String query="DELETE from movie where id=?";
        return jdbcTemplate.update(query, id);


    }
}
*/