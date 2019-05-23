package com.endava.SpringSecurity4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public class UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT * FROM User u WHERE u.username = :username")
    public User findUserByUsername(@Param("username") String username);
}
