package com.example.crococoder.sport.repositories;
import com.example.crococoder.sport.models.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Boolean existsByEmail(String email);
	Optional<User> findByEmail(String email);
}
