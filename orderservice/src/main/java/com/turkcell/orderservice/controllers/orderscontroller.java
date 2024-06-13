package com.turkcell.orderservice.controllers;

import com.turkcell.orderservice.Services.abstracts.OrderServices;
import com.turkcell.orderservice.Services.concretes.OrderServicesImpl;
import com.turkcell.orderservice.clients.ProductServiceClient;
import com.turkcell.orderservice.entities.Order;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class orderscontroller {


    private final ProductServiceClient productServiceClient;

    private final OrderServices orderServices;

    public orderscontroller(ProductServiceClient productServiceClient, OrderServices orderServices) {
        this.productServiceClient = productServiceClient;
        this.orderServices = orderServices;
    }


    @PostMapping
    public String addOrder(@RequestBody Order order){

       orderServices.add(order);
      //  int stockResult = productServiceClient.getStockByProductId(productId);
        return "Sipariş Eklendi";

    }

    @GetMapping("/get/{id}")
    public Order getId(@PathVariable int id){
        return orderServices.getOrder(id);
    }




}
