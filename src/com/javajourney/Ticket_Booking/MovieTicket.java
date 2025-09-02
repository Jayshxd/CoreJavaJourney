package com.javajourney.Ticket_Booking;

public class MovieTicket extends Ticket implements Cancellable{
    private String movieName;
    private String theaterName;
    private String screenNumber;
    private String seatNumber;

    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getTheaterName() {
        return theaterName;
    }
    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }
    public String getScreenNumber() {
        return screenNumber;
    }
    public void setScreenNumber(String screenNumber) {
        this.screenNumber = screenNumber;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }



    MovieTicket(String name, String ticketId ,String movieName, String theaterName, String screenNumber, String seatNumber){
        super(ticketId,name);
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.screenNumber = screenNumber;
        this.seatNumber = seatNumber;

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
        return "Name : "+this.getName()+"TID : "+this.getTicketId();
    }

    @Override
    public String getJourneyDetails() {
        return "Movie : "+this.getMovieName()+"Theater : "+this.getTheaterName()+"Screen Number : "+this.getScreenNumber()+"Seat Number : "+this.getSeatNumber();

    }
}
