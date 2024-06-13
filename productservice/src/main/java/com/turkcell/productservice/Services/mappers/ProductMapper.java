package com.turkcell.productservice.Services.mappers;

import com.turkcell.productservice.dtos.requests.AddProductRequest;
import com.turkcell.productservice.dtos.responses.ListProductResponse;
import com.turkcell.productservice.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {



        ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);


        ListProductResponse productToListProductResponse(Product product);

        List<ListProductResponse> productsToListProductResponses(List<Product> products);
    }






