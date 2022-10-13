package dev.lucas.AppRegions.user.models.responses;

public class UserResponseLogin {

    private String token;
    private boolean isLogged;

    public UserResponseLogin() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

}
