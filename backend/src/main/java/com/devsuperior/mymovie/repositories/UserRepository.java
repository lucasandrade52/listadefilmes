package com.devsuperior.mymovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.mymovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}