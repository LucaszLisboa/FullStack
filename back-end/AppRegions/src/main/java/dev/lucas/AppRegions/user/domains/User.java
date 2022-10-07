package dev.lucas.AppRegions.user.domains;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String id;
    private String userId;
    private String userName;
    private String userEmail;
    private String userPassword;

    private String userUF;
    private String userCity;

    public User() {

    }

    public String getUserId() {
        return userId;
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

    public void setUserId(String userId) {
        this.userId = userId;
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

}
