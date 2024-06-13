package com.turkcell.productservice.dtos.requests;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public class AddProductRequest {

    @NotBlank(message = "Ürün ismi bos bırakılamaz.")
    private String name;
    @NotBlank(message = "Ürün Karakteri bos bırakılamaz.")
    private String prodChar;
    @NotBlank(message = "Ürün Adresi bos bırakılamaz.")
    private String serviceAdress;
    @NotBlank(message = "Ürün başlangıc tarihi bos bırakılamaz.")
    private Date startDate;

    public AddProductRequest(String name, String prodChar, String serviceAdress, Date startDate) {
        this.name = name;
        this.prodChar = prodChar;
        this.serviceAdress = serviceAdress;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProdChar() {
        return prodChar;
    }

    public void setProdChar(String prodChar) {
        this.prodChar = prodChar;
    }

    public String getServiceAdress() {
        return serviceAdress;
    }

    public void setServiceAdress(String serviceAdress) {
        this.serviceAdress = serviceAdress;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
