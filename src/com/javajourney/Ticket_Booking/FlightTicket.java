package com.javajourney.Ticket_Booking;

public class FlightTicket extends Ticket implements Cancellable {
    private String flightNumber;
    private String seatNumber;
    private String arrival;
    private String departure;

    //Constructor
    FlightTicket(String passengerName,String ticketId,String flightNumber, String seatNumber, String arrival, String departure) {
        super(ticketId,passengerName);
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.arrival = arrival;
        this.departure = departure;

    }

    //Getters And Setters
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public String getArrival() {
        return arrival;
    }
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public String getDeparture() {
        return departure;
    }
    public void setDeparture(String departure) {
        this.departure = departure;
    }



    @Override
    public boolean cancel() {
        return true;
    }

    @Override
    public double getCancellationFee() {
        return 0;
    }

    @Override
    public String getTicketDetails() {
        return "Name : "+this.getName()+" "+"TID : "+this.getTicketId();
    }

    @Override
    public String getJourneyDetails() {
        return "Flight Number : "+this.getFlightNumber()+"Seat Number : "+this.getSeatNumber()+"Arrival : "+this.getArrival()+"Departure : "+this.getDeparture();
    }
}
