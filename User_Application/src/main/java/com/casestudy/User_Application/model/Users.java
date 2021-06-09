package com.casestudy.User_Application.model;
import org.springframework.data.mongodb.core.mapping.*;
import java.lang.reflect.*;

@Document(value = "userinfo")
public class Users {
    private String userId;
    private String userName;
    private String userContact;
    private String userEmail;
    private String userAddress;
    private String password;
    private CarDetails carDetails;
    public Users(String userId, String userName, String userContact, String userEmail, String userAddress, String password) {
        this.userId = userId;
        this.userName = userName;
        this.userContact = userContact;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.password = password;
    }
    public Users() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
