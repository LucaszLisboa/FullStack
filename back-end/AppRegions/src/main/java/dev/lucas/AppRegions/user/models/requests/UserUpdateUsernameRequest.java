package dev.lucas.AppRegions.user.models.requests;

public class UserUpdateUsernameRequest {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UpdateRequest{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
