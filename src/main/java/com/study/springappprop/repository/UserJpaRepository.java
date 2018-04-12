package com.study.springappprop.repository;

import com.study.springappprop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
