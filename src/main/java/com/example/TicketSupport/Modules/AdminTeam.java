package com.example.TicketSupport.Modules;

import jakarta.persistence.*;

@Entity
public class AdminTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    private String name;
    private String emailId;

    public AdminTeam(Long adminId, String name, String emailId) {
        this.adminId = adminId;
        this.name = name;
        this.emailId = emailId;
    }
    public AdminTeam() {

    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}