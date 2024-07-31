package com.example.rimtrack.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.rimtrack.entity.User;
@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
          Optional<User> findOneByUsernameAndPassword(String username, String password);

    User findByUsername(String username);
}