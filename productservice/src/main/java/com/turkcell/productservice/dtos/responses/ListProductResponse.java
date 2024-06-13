package com.turkcell.productservice.dtos.responses;



import java.util.Date;

public class ListProductResponse  {


    private String name;
    private String prodChar;
    private String serviceAdress;
    private Date startDate;

    public ListProductResponse( String name, String prodChar, String serviceAdress, Date startDate) {

        this.name = name;
        this.prodChar = prodChar;
        this.serviceAdress = serviceAdress;
        this.startDate = startDate;
    }

    public ListProductResponse() {
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
