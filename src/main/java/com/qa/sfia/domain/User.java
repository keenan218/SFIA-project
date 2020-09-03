package com.qa.sfia.domain;


import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userName;

    @Column
    private String fName;

    @Column
    private String lName;

    @Column
    private String email;

    @Column
    private String password;

    //@ManyToOne(targetEntity = WishList.class)
    //private WishList wishList;

    public User() {
    }

    public User(Long id, String userName, String fName, String lName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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
}

