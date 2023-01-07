package com.example.movieDirector.Controller;

import com.example.movieDirector.Model.Director;
import com.example.movieDirector.Model.Movie;
import com.example.movieDirector.Service.movieDirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class movieDirectorController {
    @Autowired
    movieDirectorService movieDirService;

    @PostMapping("/addMovie")
    public void addMovie(@RequestBody() Movie movie){
        movieDirectorService.addMovie(movie);
    }

    @PostMapping("/addDirector")
    public void addDirector(@RequestBody()Director director){
        movieDirectorService.addDirector(director);
    }

    @GetMapping("/findDirector")
    public Director findDirector(@PathVariable() String name){
       return movieDirectorService.findDirector(name);
    }

    @GetMapping("/findMovie")
    public Movie findMovie(@PathVariable() String name){
        return movieDirectorService.findMovie(name);
    }
}
