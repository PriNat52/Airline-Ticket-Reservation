package edu.bu.met.cs665.reservationsystem;

import org.apache.log4j.Logger;

/*Editing the given name*/

public class Name extends EditDecorator{
    Flight flight;
    
    private static Logger logger = Logger.getLogger(Name.class);

    public Name(Flight flight){
        this.flight = flight;
    }

    public void editTicket(){
        logger.info("Given Name updated!!");
    }
    
    
    public void bookTicket(){
        flight.bookTicket();
    }

    public void cancelTicket(){
        flight.cancelTicket();
    }
}