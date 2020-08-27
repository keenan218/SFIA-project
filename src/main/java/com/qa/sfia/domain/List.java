package com.qa.sfia.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class List {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String WishList;

    public List() {
    }

    public List(String wishList) {
        WishList = wishList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWishList() {
        return WishList;
    }

    public void setWishList(String wishList) {
        WishList = wishList;
    }
}
