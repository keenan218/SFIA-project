package com.qa.sfia.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class WishList {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @OneToMany(mappedBy = "wishList", fetch = FetchType.LAZY)
    private List<Entry> entries = new ArrayList<>();

    public WishList() {
    }

    public WishList(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
