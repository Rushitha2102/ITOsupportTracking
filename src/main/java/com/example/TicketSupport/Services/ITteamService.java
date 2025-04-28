package com.example.TicketSupport.Services;

import com.example.TicketSupport.Dto.CommentDTO;
import com.example.TicketSupport.Dto.TicketDTO;
import com.example.TicketSupport.Modules.Comment;
import com.example.TicketSupport.Modules.Ticket;
import com.example.TicketSupport.Repositories.CommentRepo;
import com.example.TicketSupport.Repositories.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequestMapping("/api/itteam")
public class ITteamService {
    @Autowired
    TicketRepo ticketRepo;
    CommentRepo commentRepo;

    public List<TicketDTO> getAllTickets() {
        List<Ticket> tickets = ticketRepo.findAll();

        if (tickets.isEmpty()) {
            return null;
        }

        return tickets.stream().map(ticket -> {
            TicketDTO dto = new TicketDTO();
            dto.setTicketId(ticket.getTicketId());
            dto.setCategory(ticket.getCategory().getCategoryDesc());
            dto.setSubCategory(ticket.getSubCategory().getSubCategoryDesc());
            dto.setSubject(ticket.getSubject());
            dto.setPriority(ticket.getPriority() != null ? ticket.getPriority().getPriority() : "No Priority Set");
            dto.setStatus(ticket.getStatus().getStatus());
            dto.setAssigneeName(ticket.getAssignee() != null ? ticket.getAssignee().getName() : "No Assignee");
            dto.setTicketLink("api/tickets/view/" + ticket.getTicketId());
            return dto;
        }).collect(Collectors.toList());
    }


}
