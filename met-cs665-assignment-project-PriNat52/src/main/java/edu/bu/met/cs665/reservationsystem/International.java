package edu.bu.met.cs665.reservationsystem;

import org.apache.log4j.Logger;

/*
 * International flights booking and canceling tickets
 * */

public class International extends Flight{
    
    private static Logger logger = Logger.getLogger(International.class);

    public International(Ticket ticket){
        super(ticket);
    }

    public void bookTicket(){
        logger.info("International Ticket ready for reservation:");
        ticket.bookTicket();
    }

    public void cancelTicket(){
        logger.info("International Ticket ready for cancelation:");
        ticket.cancelTicket();
    }

    public void editTicket(){}
}
