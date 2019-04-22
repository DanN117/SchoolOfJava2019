package com.endava.s05e01.controller;

import com.endava.s05e01.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {


    @Autowired
    private MovieService movieService;
    //CREATE
    //RequestBody
    //RequesttParam
    //PathVariable
    //@RequestMapping(value = "/", method = @RequestMethod.POST)
    @PostMapping(value = "/")
    public int add(@RequestParam String title, @RequestParam String genre) {
        return movieService.add(title, genre);
    }

    @PostMapping(value = "/add")
    public String addMovie (@RequestBody Movie movie) {
        
    }


    //RETRIEVE

    //UPDATE

    //DELETE
    @DeleteMapping(value = "/(id)")
    public int delete(@PathVariable int id) {
        movieService.delete(id);

        return 0;
    }
}
