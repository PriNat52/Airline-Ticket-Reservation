package edu.bu.met.cs665.reservationsystem;

import org.apache.log4j.Logger;

/*Editing the number of seats*/

public class Seats extends EditDecorator{
    Flight flight;
    private static Logger logger = Logger.getLogger(Seats.class);

    public Seats(Flight flight){
        this.flight = flight;
    }

    public void editTicket(){
        logger.info("Number of seats updated!!");
    }
    
    
    public void bookTicket(){
       flight.bookTicket();
    }

    public void cancelTicket(){
        flight.cancelTicket();
    }

}
