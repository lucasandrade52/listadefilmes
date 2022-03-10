package com.devsuperior.mymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.mymovie.entities.Score;
import com.devsuperior.mymovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}