package com.example.TicketSupport.Repositories;

import com.example.TicketSupport.Modules.Category;
import com.example.TicketSupport.Modules.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo extends JpaRepository<Status,Long> {
}
