package com.assesment.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesment.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
