package edu.bu.met.cs665.testflight;

import org.apache.log4j.Logger;
import org.junit.Test;

import edu.bu.met.cs665.reservationsystem.*;

public class TestTicket {

	private static Logger logger = Logger.getLogger(TestTicket.class);
	
	@Test
	public void test() {

		/*
		 * Test Run for Domestic Flights - Bridge Pattern
		 * */
		logger.info("**{{ DOMESTIC BOOKING }}**");
        Flight flight1 = new Domestic(new DomesticTicket());
        flight1.bookTicket();
        
        //Test for editing tickets with decorator pattern
        logger.info("{{-- Editing Ticket --}}");
        flight1 = new Name(flight1);
        flight1.editTicket();
        
        flight1.cancelTicket();
        logger.info("**----**");
        
        /*
		 * Test Run for International Flights - Bridge Pattern
		 * */
        logger.info("**{{ INTERNATIONAL BOOKING }}**");
        Flight flight2 = new International(new InternationalTicket());
        flight2.bookTicket();
        
        //Test for editing tickets with decorator pattern
        logger.info("{{-- Editing Ticket --}}");
        flight2 = new Seats(flight2);
        flight2.editTicket();
        
        flight2.cancelTicket();
        logger.info("**----**");
	}

}