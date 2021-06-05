package io.adminapplication.Admin_Application.model;

public class AdminInfo {
    private String adminId;
    private String adminEmail;
    private String adminPassword;

    public AdminInfo() {
    }

    public AdminInfo(String adminId, String adminEmail, String adminPassword) {
        this.adminId = adminId;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
