package com.tidz.sec2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tidz.sec2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
