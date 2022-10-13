package dev.lucas.AppRegions.user.models.responses;

public class UserResponse {
    private String userName;
    private String userEmail;
    private String userUF;
    private String userCity;

    private boolean isLogged;
    private String token;

    public UserResponse() {

    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
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

    public void setUserUF(String userUF) {
        this.userUF = userUF;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userUF='" + userUF + '\'' +
                ", userCity='" + userCity + '\'' +
                ", isLogged='" + isLogged + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
