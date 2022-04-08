package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;



@Entity
@Table(name="cart")
public class CartModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "productId")
    private String cartItemID;

    @Column(name = "userId")
    private String userId;

    @Column(name = "productName")
    private String ProductName;

    @Column(name = "quantity")
    private int Quantity;

    @Column(name = "price")
    private String Price;

    public CartModel(){}
    public CartModel(String id,String cartItemID,String userId,String ProductName,int Quantity,String Price){
        this.id = id;
        this.cartItemID = cartItemID;
        this.userId = userId;
        this.ProductName = ProductName;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public void setId(String id){
        this.id = id;
    }
    
    public void setCartItemId(String cartItemID){
        this.cartItemID = cartItemID;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setProductName(String ProductName){
        this.ProductName = ProductName;
    }

    public void setQuantity(int Quantity){
        this.Quantity = Quantity;
    }

    public void setPrice(String Price){
        this.Price = Price;
    }

    public String getId(){
        return id; 
    }

    public String getCartItemId(){
        return cartItemID;
    }

    public String getUserId(){
        return userId;
    }

    public String getProductName(){
        return ProductName;
    }

    public int getQuantity(){
        return Quantity;
    }

    public String getPrice(){
        return Price;
    }


    
}
