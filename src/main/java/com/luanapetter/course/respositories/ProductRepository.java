package com.luanapetter.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanapetter.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
