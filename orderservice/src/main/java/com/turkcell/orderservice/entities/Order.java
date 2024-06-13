package com.turkcell.orderservice.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Order() {
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
