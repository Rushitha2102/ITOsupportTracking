package com.example.TicketSupport.Repositories;

import com.example.TicketSupport.Modules.Category;
import com.example.TicketSupport.Modules.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepo extends JpaRepository<Priority,Long> {
}
