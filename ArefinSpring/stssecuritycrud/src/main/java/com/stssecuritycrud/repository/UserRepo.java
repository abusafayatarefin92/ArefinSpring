package com.stssecuritycrud.repository;

import com.stssecuritycrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    public Optional<User> findByUsernameOrEmail(String username, String email);
    User findByUsername(String username);
    User findByName(String name);
}
