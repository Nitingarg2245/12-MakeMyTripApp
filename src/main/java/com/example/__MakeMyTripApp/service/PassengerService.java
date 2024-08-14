package com.example.__MakeMyTripApp.service;

import com.example.__MakeMyTripApp.bindingClass.Passenger;
import com.example.__MakeMyTripApp.bindingClass.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PassengerService {
    private static final String RAIL_TICKET_URL="http://localhost:9090/ticket";
    public Ticket ticketBookingFromOtherApp(Passenger passenger){
        RestTemplate rt=new RestTemplate();
        ResponseEntity<Ticket> response = rt.postForEntity(RAIL_TICKET_URL, passenger, Ticket.class);
        int value = response.getStatusCode().value();
        if(value==200)return response.getBody();
        else  return null;
    }
}
