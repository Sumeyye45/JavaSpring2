package com.turkcell.productservice.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "products")
public class Product {



    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "prodChar")
    private String prodChar;
    @Column(name = "serviceAdress")
    private String serviceAdress;
    @Column(name = "startDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;   //ürün ekleme tarihi


    public Product(int id, String name, String prodChar, String serviceAdress, Date startDate){
        this.id = id;
        this.name = name;
        this.prodChar = prodChar;
        this.serviceAdress = serviceAdress;
        this.startDate = startDate;
    }

    public Product() {
    }
}
