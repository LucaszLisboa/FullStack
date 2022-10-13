package dev.lucas.AppRegions.user.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String id;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userUF;
    private String userCity;
    private boolean isLogged;
    private String token;

    public User() {

    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserUF() {
        return userUF;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getToken() {
        return token;
    }

    public boolean isLogged() {
        return isLogged;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserUF(String userUF) {
        this.userUF = userUF;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    public void setToken(String token) {
        this.token = token;
    }



}
