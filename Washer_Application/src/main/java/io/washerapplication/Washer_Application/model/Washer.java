package io.washerapplication.Washer_Application.model;

public class Washer {
    private String washerId;
    private String password;
    public Washer() {
    }
    public Washer(String washerId, String password) {
        this.washerId = washerId;
        this.password = password;
    }

    public String getWasherId() {
        return washerId;
    }

    public void setWasherId(String washerId) {
        this.washerId = washerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Washer{" +
                "washerId='" + washerId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
