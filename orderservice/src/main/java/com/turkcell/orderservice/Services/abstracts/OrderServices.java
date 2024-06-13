package com.turkcell.orderservice.Services.abstracts;

import com.turkcell.orderservice.entities.Order;

public interface OrderServices {

    Order getOrder(int id);
    void add(Order order);

}
