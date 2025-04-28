package com.example.TicketSupport.Dto;

import java.time.LocalDateTime;
import java.util.List;

public class TicketDTO {

        private Long ticketId;
        private String category;
        private String subCategory;
        private String subject;
        private String priority;
        private String status;
        private String assigneeName;
        private String reporterName;
        private LocalDateTime createDateTime;
        private LocalDateTime lastModifiedDateTime;
        private List<CommentDTO> comments;
private  String ticketLink ;

    public String getTicketLink() {
        return ticketLink;
    }

    public void setTicketLink(String ticketLink) {
        this.ticketLink = ticketLink;
    }

    public TicketDTO(Long ticketId, String category, String subCategory, String subject, String priority, String status, String assigneeName, String reporterName, LocalDateTime createDateTime, LocalDateTime lastModifiedDateTime, List<CommentDTO> comments) {
        this.ticketId = ticketId;
        this.category = category;
        this.subCategory = subCategory;
        this.subject = subject;
        this.priority = priority;
        this.status = status;
        this.assigneeName = assigneeName;
        this.reporterName = reporterName;
        this.createDateTime = createDateTime;
        this.lastModifiedDateTime = lastModifiedDateTime;

        this.comments = comments;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssigneeName() {
        return assigneeName;
    }

    public void setAssigneeName(String assigneeName) {
        this.assigneeName = assigneeName;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
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

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }
    public TicketDTO() {

    }
}


