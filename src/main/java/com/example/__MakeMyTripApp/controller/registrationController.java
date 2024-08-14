package com.example.__MakeMyTripApp.controller;

import com.example.__MakeMyTripApp.bindingClass.Passenger;
import com.example.__MakeMyTripApp.bindingClass.Ticket;
import com.example.__MakeMyTripApp.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class registrationController {
    @Autowired
    private PassengerService passengerService;

    @GetMapping("/register")   //http://localhost:8080/register
    public String makeRegistration(Model model){
        model.addAttribute("passenger",new Passenger());
        return "register";
    }

    @PostMapping("/ticketInfo")
    public String fallBAck(@ModelAttribute("passenger") Passenger passenger,Model model){
        Ticket ticket = passengerService.ticketBookingFromOtherApp(passenger);
        model.addAttribute("ticket",ticket);
        return "ticketINFO";
    }


}
