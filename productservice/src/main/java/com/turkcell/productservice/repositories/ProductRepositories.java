package com.turkcell.productservice.repositories;

import com.turkcell.productservice.dtos.requests.AddProductRequest;
import com.turkcell.productservice.dtos.responses.ListProductResponse;
import com.turkcell.productservice.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositories extends JpaRepository<Product,Integer> {



    List<Product> findAll();

    List<Product> findAllById(int id);

    void save(AddProductRequest request);


}
