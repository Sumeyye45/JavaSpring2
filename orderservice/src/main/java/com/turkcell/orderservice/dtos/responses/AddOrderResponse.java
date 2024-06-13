package com.turkcell.orderservice.dtos.responses;

import jakarta.persistence.Column;

public class AddOrderResponse {

    private int id;
    private String name;

    public AddOrderResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public AddOrderResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
