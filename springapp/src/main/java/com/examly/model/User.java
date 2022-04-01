package com.examly.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "mobilenumber")
    private String mobNo;
    private String username;
    private String email;
    private String password;
    private String active;
    private String role;
    private String cart;
    private String orderlist;

    public User() {
    }

    public User(String mobNo, String username, String email, String password, String active, String role, String cart,
            String orderlist) {
        this.mobNo = mobNo;
        this.username = username;
        this.email = email;
        this.password = password;
        this.active = active;
        this.role = role;
        this.cart = cart;
        this.orderlist = orderlist;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCart() {
        return cart;
    }

    public void setCart(String cart) {
        this.cart = cart;
    }

    public String getOrderList() {
        return orderlist;
    }

    public void setOrderList(String orderList) {
        this.orderlist = orderList;
    }

    @Override
    public String toString() {
        return "User [active=" + active + ", cart=" + cart + ", email=" + email + ", mobNo=" + mobNo + ", orderlist="
                + orderlist + ", password=" + password + ", role=" + role + ", username=" + username + "]";
    }

}
