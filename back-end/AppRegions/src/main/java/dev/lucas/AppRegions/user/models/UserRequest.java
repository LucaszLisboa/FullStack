package dev.lucas.AppRegions.user.models;

public class UserRequest {
    private String userName;
    private String userEmail;
    private String userPassword;

    private String userUF;
    private String userCity;

    public UserRequest() {

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

    @Override
    public String toString() {
        return "UserResponse{" +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userUF='" + userUF + '\'' +
                ", userCity='" + userCity + '\'' +
                '}';
    }

}

