package com.qa.sfia.domain;

import javax.persistence.*;


@Entity
public class Entry {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String description;

    @ManyToOne(targetEntity = WishList.class)
    private WishList wishList;

    public Entry() {
    }

    public Entry(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WishList getWishList(){
        return wishList;
    }

    public void setWishList(WishList wishList) {
        this.wishList = wishList;
    }
}
