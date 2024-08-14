package com.example.__MakeMyTripApp.bindingClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private Integer ticketId;
    private String from;
    private String to;
    private String firstName;
    private String lastName;
    private Double ticketPrice;
}
