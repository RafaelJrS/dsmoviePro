package com.devsuperior.dsmoviePro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmoviePro.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
