package com.qa.sfia.dto;

public class EntryDTO {

    private Long id;
    private String description;

    public EntryDTO(){
    }

    public EntryDTO(String description) {
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
}


