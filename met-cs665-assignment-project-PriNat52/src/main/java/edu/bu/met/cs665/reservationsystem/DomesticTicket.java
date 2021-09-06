package edu.bu.met.cs665.reservationsystem;

import org.apache.log4j.Logger;

/*
 * Domestic flights booking and canceling tickets
 * */

public class DomesticTicket implements Ticket{

    private static Logger logger = Logger.getLogger(DomesticTicket.class);

    @Override
    public void bookTicket(){
        logger.info("Reserved your Domestic Ticket!!");
    }

    @Override
    public void cancelTicket(){
        logger.info("Canceled your Domestic Ticket!!");
    }
}
