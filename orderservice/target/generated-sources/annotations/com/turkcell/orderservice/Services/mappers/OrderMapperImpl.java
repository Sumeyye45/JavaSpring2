package com.turkcell.orderservice.Services.mappers;

import com.turkcell.orderservice.dtos.requests.AddOrderRequest;
import com.turkcell.orderservice.entities.Order;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-20T18:59:16+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order productFromRequest(AddOrderRequest request) {
        if ( request == null ) {
            return null;
        }

        String name = null;

        name = request.getName();

        int id = 0;

        Order order = new Order( id, name );

        return order;
    }
}
