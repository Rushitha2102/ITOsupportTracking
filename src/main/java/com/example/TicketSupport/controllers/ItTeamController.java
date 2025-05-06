package com.example.TicketSupport.Controllers;

import com.example.TicketSupport.Dto.CommentDTO;
import com.example.TicketSupport.Dto.TicketDTO;
import com.example.TicketSupport.Modules.Ticket;
import com.example.TicketSupport.Services.ITteamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
    @RequestMapping("/api/itteam")
    public class ITteamController {

        @Autowired
        private ITteamService iTteamService;

        @GetMapping("/view-tickets")
        public ResponseEntity<?> viewTicketList() {
            List<TicketDTO> ticketList = iTteamService.getAllTickets();

            if (ticketList == null || ticketList.isEmpty()) {
                return ResponseEntity.ok("No data Found");
            }

            return ResponseEntity.ok(ticketList);
        }


    }



