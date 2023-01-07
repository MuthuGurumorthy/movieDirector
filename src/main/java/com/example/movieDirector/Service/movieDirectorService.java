package com.example.movieDirector.Service;

import com.example.movieDirector.Model.Director;
import com.example.movieDirector.Model.Movie;
import com.example.movieDirector.Repository.directorrepository;
import com.example.movieDirector.Repository.movierepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class movieDirectorService {
    @Autowired
    static
    movierepository movierepo;

    @Autowired
    static
    directorrepository directorrepo;

    public static void addMovie(Movie movie) {
        movierepo.save(movie);
    }

    public static void addDirector(Director director){
        directorrepo.save(director);
    }

    public static Director findDirector(String name) {
        Director director = directorrepo.findById(name);
        return director;
    }

    public static Movie findMovie(String name){
        Movie movie = movierepo.findById(name);
        return movie;
    }
}
