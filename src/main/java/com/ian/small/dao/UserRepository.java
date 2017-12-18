package com.ian.small.dao;

import com.ian.small.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @RestResource(path = "userNameStartsWith", rel = "userNameStartsWith")
    List<User> findByUsernameStartsWith(@Param("username") String username);

    User findById(@Param("id") Long id);
}
