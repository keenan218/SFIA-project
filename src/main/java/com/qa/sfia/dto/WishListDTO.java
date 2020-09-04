package com.qa.sfia.dto;

import java.util.ArrayList;
import java.util.List;

public class WishListDTO {

    private Long id;
    private String title;
    private List<EntryDTO> entries = new ArrayList<>();

    public WishListDTO(){
    }

    public WishListDTO(String title){
        super();
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

    public List<EntryDTO> getEntries() {
        return entries;
    }

    public void setEntries(List<EntryDTO> entries) {
        this.entries = entries;
    }
}
