package com.turkcell.orderservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "productservice")
public interface ProductServiceClient {

     @GetMapping("/api/v1/products")   //get isteği at
     int getStockByProductId(@RequestParam int productId);
}
