package com.examly.springapp.model;

import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
// import javax.persistence.OneToOne;
// import javax.persistence.OneToMany;
// import javax.persistence.JoinColumn;
// import javax.persistence.CascadeType;

// import java.util.List;
// import java.util.Objects;
@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email",nullable = false, unique= true)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "mobileNumber",nullable = false)
    private String mobileNumber;

    @Column(name = "active")
    private boolean active;

    @Column(name = "role",nullable = false)
    private String role;
     
    // @Column()
    // @OneToOne(cascade = CascadeType.ALL)
    // private CartModel cart;

    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(name = "order_id")
    // private List<OrderModel> ordersList;

    public UserModel(){}
    public UserModel(String email,String password,String username,String mobileNumber,boolean active,String role){
        this.email = email;
        this.password = password;
        this.username = username;
        this.active = active;
        this.mobileNumber = mobileNumber;
        this.role = role;
        // this.cart = cart;
        // this.ordersList = ordersList;
    }
    
    // public void setId(Long id){
    //     this.id = id;
    // }
    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public void setRole(String role){
        this.role = role;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    // public void setCart(CartModel cart){
    //     this.cart = cart;
    // }

    // public void setOrdersList(List<OrderModel> ordersList){
    //     this.ordersList = ordersList;
    // }


    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getUsername(){
        return username;
    }

    public String getMobileNumber(){
        return mobileNumber;
    }

    public String getRole(){
        return role;
    }

    public boolean getActive(){
        return active;
    }

    // public Long getId(){
    //     return this.id;
    // }

    // public CartModel getCart(){
    //     return this.cart;
    // }

    // public List<OrderModel> getOrdersList(){
    //     return this.ordersList;
    // }

}
