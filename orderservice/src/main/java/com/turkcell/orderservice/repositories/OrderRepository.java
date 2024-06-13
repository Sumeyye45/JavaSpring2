package com.turkcell.orderservice.repositories;

import com.turkcell.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer>{

    Order findById(int id);
}
