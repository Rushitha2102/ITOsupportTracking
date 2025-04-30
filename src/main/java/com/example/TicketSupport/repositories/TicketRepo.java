package com.example.TicketSupport.Repositories;

import com.example.TicketSupport.Modules.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket,Long> {
}
