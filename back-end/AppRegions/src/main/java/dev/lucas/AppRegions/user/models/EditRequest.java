package dev.lucas.AppRegions.user.models;

public class EditRequest {

    String userName;

    public EditRequest() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "EditRequest{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
