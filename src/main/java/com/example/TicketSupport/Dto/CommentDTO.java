package com.example.TicketSupport.Dto;

public class CommentDTO {
    private Long userId;
    private String message;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CommentDTO(Long userId, String message) {
        this.userId = userId;
        this.message = message;
    }
    public CommentDTO() {

    }
}