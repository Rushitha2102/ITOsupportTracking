package com.example.TicketSupport.dto;

import java.time.LocalDateTime;

public class UserDTO {
    private Long userId;

    private String name;
    private String emailId;
    private LocalDateTime createDateTime;
    private LocalDateTime lastModifiedDateTime;

    public UserDTO(String name, Long userId, String emailId, LocalDateTime createDateTime, LocalDateTime lastModifiedDateTime) {
        this.name = name;
        this.userId = userId;
        this.emailId = emailId;
        this.createDateTime = createDateTime;
        this.lastModifiedDateTime = lastModifiedDateTime;
    }
    public UserDTO() {

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
