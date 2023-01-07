package com.example.movieDirector.Repository;

import com.example.movieDirector.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movierepository extends JpaRepository<Movie,String> {
}
