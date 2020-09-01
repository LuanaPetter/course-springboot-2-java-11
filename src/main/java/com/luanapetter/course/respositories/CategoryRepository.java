package com.luanapetter.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanapetter.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
