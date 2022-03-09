package com.devsuperior.mymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.mymovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}