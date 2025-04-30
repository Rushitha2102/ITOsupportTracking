package com.example.TicketSupport.Repositories;

import com.example.TicketSupport.Modules.AdminTeam;
import com.example.TicketSupport.Modules.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminTeamRepo extends JpaRepository<AdminTeam,Long> {
}
