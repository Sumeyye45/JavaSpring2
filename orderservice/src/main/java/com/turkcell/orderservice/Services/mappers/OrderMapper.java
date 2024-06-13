package com.turkcell.orderservice.Services.mappers;

import com.turkcell.orderservice.dtos.requests.AddOrderRequest;
import com.turkcell.orderservice.entities.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);


    Order productFromRequest (AddOrderRequest request);


}
