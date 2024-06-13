package com.turkcell.productservice.Services.mappers;

import com.turkcell.productservice.dtos.responses.ListProductResponse;
import com.turkcell.productservice.entities.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-28T17:46:22+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ListProductResponse productToListProductResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ListProductResponse listProductResponse = new ListProductResponse();

        listProductResponse.setName( product.getName() );
        listProductResponse.setProdChar( product.getProdChar() );
        listProductResponse.setServiceAdress( product.getServiceAdress() );
        listProductResponse.setStartDate( product.getStartDate() );

        return listProductResponse;
    }

    @Override
    public List<ListProductResponse> productsToListProductResponses(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ListProductResponse> list = new ArrayList<ListProductResponse>( products.size() );
        for ( Product product : products ) {
            list.add( productToListProductResponse( product ) );
        }

        return list;
    }
}
