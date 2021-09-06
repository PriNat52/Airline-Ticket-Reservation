package edu.bu.met.cs665.reservationsystem;

import org.apache.log4j.Logger;

/*
 * International flights booking and canceling tickets
 * */

public class InternationalTicket implements Ticket{
    
    private static Logger logger = Logger.getLogger(InternationalTicket.class);

    @Override
    public void bookTicket(){
        logger.info("Reserved your International Ticket!!");
    }
    
    @Override
    public void cancelTicket(){
        logger.info("Canceled your International Ticket!!");
    }

}
