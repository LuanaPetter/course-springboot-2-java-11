package com.luanapetter.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanapetter.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
