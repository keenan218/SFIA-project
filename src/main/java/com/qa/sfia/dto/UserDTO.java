package com.qa.sfia.dto;

public class UserDTO {

    private Long id;
    private String userName;
    private String fName;
    private String lName;
    private String email;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String userName, String fName, String lName, String email, String password) {
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
