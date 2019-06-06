package com.endava.SoJ16.repositories;

import com.endava.SoJ16.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    public Optional<User> findUserByUsername(String username);
        // Optional<User>
}
