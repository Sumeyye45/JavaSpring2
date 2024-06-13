package com.turkcell.orderservice.dtos.requests;

import jakarta.validation.constraints.NotBlank;

public class AddOrderRequest {

    @NotBlank
    private String name;

    public AddOrderRequest(String name) {
        this.name = name;
    }

    public AddOrderRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
