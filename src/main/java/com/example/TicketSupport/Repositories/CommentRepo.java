package com.example.TicketSupport.Repositories;

import com.example.TicketSupport.Modules.Category;
import com.example.TicketSupport.Modules.Comment;
import com.example.TicketSupport.Modules.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepo extends JpaRepository<Comment,Long> {

        @Query("SELECT c FROM Comment c WHERE c.ticket.ticketId = :ticketId")
        List<Comment> findByTicketId(@Param("ticketId") Long ticketId);
    }


