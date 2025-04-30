package com.example.TicketSupport.Modules;

import jakarta.persistence.Entity;

import java.time.LocalDateTime;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "subCategoryId")
    private SubCategory subCategory;

    @ManyToOne
    @JoinColumn(name = "assigneeId")
    private AdminTeam assignee;

    @ManyToOne
    @JoinColumn(name = "reportedId")
    private User reportedBy;

    private String subject;
    private String description;

    @ManyToOne
    @JoinColumn(name = "statusId")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "priorityId")
    private Priority priority;

    private LocalDateTime createDateTime;
    private LocalDateTime lastModifiedDateTime;

    public Ticket(Long ticketId, Category category, SubCategory subCategory, AdminTeam assignee, User reportedBy, String subject, String description, Status status, Priority priority, LocalDateTime createDateTime, LocalDateTime lastModifiedDateTime) {
        this.ticketId = ticketId;
        this.category = category;
        this.subCategory = subCategory;
        this.assignee = assignee;
        this.reportedBy = reportedBy;
        this.subject = subject;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.createDateTime = createDateTime;
        this.lastModifiedDateTime = lastModifiedDateTime;
    }
    public Ticket() {

    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public AdminTeam getAssignee() {
        return assignee;
    }

    public void setAssignee(AdminTeam assignee) {
        this.assignee = assignee;
    }

    public User getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(User reportedBy) {
        this.reportedBy = reportedBy;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
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