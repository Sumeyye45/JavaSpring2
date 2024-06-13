package com.turkcell.orderservice.Services.concretes;

import com.turkcell.orderservice.Services.abstracts.OrderServices;
import com.turkcell.orderservice.entities.Order;
import com.turkcell.orderservice.repositories.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderServicesImpl implements OrderServices {

    private final OrderRepository orderRepository;

    public OrderServicesImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order getOrder(int id) {
        return orderRepository.findById(id);
    }

    @Override
    public void add(Order order) {
        orderRepository.save(order);
    }
}
