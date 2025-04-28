package com.example.TicketSupport.Modules;

import jakarta.persistence.*;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statusId;

    private String status;

    public Status(Long statusId, String status) {
        this.statusId = statusId;
        this.status = status;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Status() {

    }
}