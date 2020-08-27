package com.qa.sfia.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WishList {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String Title;

    public WishList() {
    }

    public WishList(String title) {
        Title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
