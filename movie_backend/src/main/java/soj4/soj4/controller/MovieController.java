package soj4.soj4.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import soj4.soj4.model.Movie;


import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/movies")
public class MovieController implements InitializingBean {

    private List<Movie>movieList=new ArrayList<>();
    //CRUD

    @Override
    public void afterPropertiesSet() throws Exception {
        for(int i=1;i<15;i++){
            Movie movie=new Movie();
            movie.setId(i);
            movie.setTitle("Movie Title" + i);
            movie.setGenre("Movie Genre"+i);
            this.movieList.add(movie);
        }
    }

    //create

    //RequestParam
    //PathVariable
    //RequestBody
    //@RequestMapping(value= " /" ,method= RequestMethod.POST)
    @PostMapping(value="/")
    public ResponseEntity<Movie> add(@RequestParam String title, @RequestParam String genre){
        Movie movie=new Movie();
        Integer latestId=movieList.stream().map(movie1-> movie.getId()).reduce((integer,integer2)->
          integer>=integer2? integer : integer2).get();
        movie.setId(latestId);
        movie.setTitle(title);
        movie.setGenre(genre);
        return ResponseEntity.ok(movie);
    }

    @PostMapping(value="/addMovie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){

        this.movieList.add(movie);
        return ResponseEntity.ok("Successfully added movie to list");

    }


    //retrieve

    //update

    //delete
    @DeleteMapping(value= "/{id}")

    private ResponseEntity<Void> delete(@PathVariable int id){
       this.movieList=this.movieList.stream().filter(movie -> movie.getId() !=id).collect(Collectors.toList());
       return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/")
   public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(this.movieList);
    }

}
