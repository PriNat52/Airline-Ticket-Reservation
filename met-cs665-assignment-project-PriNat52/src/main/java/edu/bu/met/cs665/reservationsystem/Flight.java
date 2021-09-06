package edu.bu.met.cs665.reservationsystem;

/*
 * Bridge Pattern- Abstract class
 * */

public abstract class Flight {
    protected Ticket ticket;

    public Flight(){}

    public Flight(Ticket ticket){
        this.ticket = ticket;
    }

    public abstract void bookTicket();
    public abstract void cancelTicket();
    public abstract void editTicket();
}
