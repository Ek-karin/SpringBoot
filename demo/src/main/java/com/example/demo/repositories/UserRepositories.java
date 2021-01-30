package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public interface UserRepositories extends JpaRepository<User,Integer> {
	
	@Modifying
	@Query(value = "SELECT u FROM User u WHERE u.id = 2")
	List<User> findSome();

}