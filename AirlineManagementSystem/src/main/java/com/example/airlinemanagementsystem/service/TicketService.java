package com.example.airlinemanagementsystem.service;

import com.example.airlinemanagementsystem.model.Ticket;
import com.example.airlinemanagementsystem.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    public Ticket bookTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Optional<Ticket> getTicketById(Long id) {
        return ticketRepository.findById(id);
    }

    public void cancelTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
