package com.springboot.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	User findByName(String userName);

}