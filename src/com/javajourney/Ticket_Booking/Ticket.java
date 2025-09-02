package com.javajourney.Ticket_Booking;

public abstract class Ticket {
    private String ticketId;
    private String Name;

    public abstract String getTicketDetails();
    public abstract String getJourneyDetails();

    Ticket(String ticketId,String Name){
        this.ticketId=ticketId;
        this.Name=Name;
    }

    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }

}
