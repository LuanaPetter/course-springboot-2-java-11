package com.luanapetter.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanapetter.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
