package com.example.movieDirector.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Director {
    @Id
    @Column(name = "director_name" , nullable = false)
    private String directorName;

    @Column(name = "number_of_movies" , nullable = false)
    private int numOfMovies;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Movie> movieList;
}
