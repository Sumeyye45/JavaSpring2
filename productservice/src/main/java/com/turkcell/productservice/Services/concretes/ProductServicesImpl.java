package com.turkcell.productservice.Services.concretes;

import com.turkcell.productservice.Services.abstracts.ProductServices;
import com.turkcell.productservice.Services.mappers.ProductMapper;
import com.turkcell.productservice.dtos.requests.AddProductRequest;
import com.turkcell.productservice.dtos.responses.ListProductResponse;
import com.turkcell.productservice.entities.Product;
import com.turkcell.productservice.repositories.ProductRepositories;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProductServicesImpl implements ProductServices {

    private final ProductRepositories productRepositories;

    public ProductServicesImpl(ProductRepositories productRepositories) {
        this.productRepositories = productRepositories;
    }




    @Override
    public List<ListProductResponse> goster() {

        List<Product> products = productRepositories.findAll();
        return ProductMapper.INSTANCE.productsToListProductResponses(products);

    }











    @Override
    public Product createdProducted(AddProductRequest addProductRequest) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {

       return productRepositories.findAll();


    }

    @Override
    public List<Product> getIdAllProducts(int id) {


        return productRepositories.findAllById(id);
    }









/*
    @Override
    public void add(AddProductRequest request) {


        Product product = ProductMapper.INSTANCE.productFromRequest(request);

        productRepositories.save(product);

    }

*/


}
