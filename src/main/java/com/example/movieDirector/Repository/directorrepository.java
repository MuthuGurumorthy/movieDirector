package com.example.movieDirector.Repository;

import com.example.movieDirector.Model.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface directorrepository extends JpaRepository<Director,String> {
}
