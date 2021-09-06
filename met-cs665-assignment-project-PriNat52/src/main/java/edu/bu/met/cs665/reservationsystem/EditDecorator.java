package edu.bu.met.cs665.reservationsystem;

/*
 * Decorator Pattern - for editing flight tickets
 * */

public abstract class EditDecorator extends Flight{
    
    public EditDecorator(){
        super();
    }
    public abstract void editTicket();
}
