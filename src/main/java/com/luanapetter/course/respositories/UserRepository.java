package com.luanapetter.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanapetter.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
