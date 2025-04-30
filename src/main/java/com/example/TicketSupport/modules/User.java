package com.example.TicketSupport.Modules;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String emailId;
    private LocalDateTime createDateTime;
    private LocalDateTime lastModifiedDateTime;

    public User(Long userId, String name, String emailId, LocalDateTime createDateTime, LocalDateTime lastModifiedDateTime) {
        this.userId = userId;
        this.name = name;
        this.emailId = emailId;
        this.createDateTime = createDateTime;
        this.lastModifiedDateTime = lastModifiedDateTime;
    }
    public User() {

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public LocalDateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(LocalDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }
}