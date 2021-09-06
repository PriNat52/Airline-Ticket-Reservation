package edu.bu.met.cs665.reservationsystem;

import org.apache.log4j.Logger;

/*
 * Domestic flights booking and canceling tickets
 * */

public class Domestic extends Flight {
    private static Logger logger = Logger.getLogger(Domestic.class);
    
    public Domestic(Ticket ticket){
        super(ticket);
    }

    public void bookTicket(){
        logger.info("Domestic Ticket ready for booking:");
        ticket.bookTicket();
    }

    public void cancelTicket(){
        logger.info("Domestic Ticket ready for cancelation:");
        ticket.cancelTicket();
    }

    public void editTicket(){}
}
