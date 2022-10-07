package dev.lucas.AppRegions.user.models;

public class UserModel {
    String userId;
    String userName;
    String email;
    String password;
    String uf;
    String city;
    String token;
    Boolean isLogged;

    public UserModel() {
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUf() {
        return uf;
    }

    public String getCity() {
        return city;
    }

    public String getToken() {
        return token;
    }

    public Boolean getLogged() {
        return isLogged;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setLogged(Boolean logged) {
        isLogged = logged;
    }
}
