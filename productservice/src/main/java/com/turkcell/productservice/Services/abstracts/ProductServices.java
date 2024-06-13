package com.turkcell.productservice.Services.abstracts;

import com.turkcell.productservice.dtos.requests.AddProductRequest;
import com.turkcell.productservice.dtos.responses.ListProductResponse;
import com.turkcell.productservice.entities.Product;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProductServices {

     //  void add(AddProductRequest request);
     // Product getProduct(int id);

     Product createdProducted(AddProductRequest addProductRequest);

     List<Product> getAllProducts();

     List<Product> getIdAllProducts(int id);

     List<ListProductResponse>goster();


}
