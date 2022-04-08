package com.examly.springapp.model;

import java.util.*;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "productId")
    private String productId;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "productName")
    private String productName;

    @Column(name = "price")
    private String price;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private String quantity;

    public ProductModel(){}
    public ProductModel(String productId,String imageUrl,String productName,String price,String description,String quantity){
        this.productId = productId;
        this.imageUrl = imageUrl;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public void setProductId(String productId){
        this.productId = productId;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public String getProductId(){
        return productId;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public String getProductName(){
        return productName;
    }

    public String getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public String getQuantity(){
        return quantity;
    }
}

