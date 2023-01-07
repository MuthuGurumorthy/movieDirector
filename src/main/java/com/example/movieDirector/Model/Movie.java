package com.example.movieDirector.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {
    @Id
    @Column(name = "movie_name" , nullable = false)
    private String movieName;

    @Column(name = "duration(in_minutes)" , nullable = false)
    private int duration;

    @ManyToOne
    @JsonIgnore
    private Director director;
}
