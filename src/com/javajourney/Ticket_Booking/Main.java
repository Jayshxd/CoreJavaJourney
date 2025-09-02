package com.javajourney.Ticket_Booking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();
        tickets.add(new FlightTicket("Jayesh","123123","1","A35","12:21","13:21"));
        tickets.add(new MovieTicket("Jayesh","32112212","Maharaja","Raja","2","A3"));

        for(Ticket t:tickets){
            System.out.println("--------------------");
            System.out.println(t.getTicketDetails());
            System.out.println("--------------------");
            System.out.println(t.getJourneyDetails());
            System.out.println("--------------------");
        }
    }


}
