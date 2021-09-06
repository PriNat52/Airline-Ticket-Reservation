# Airline-Ticket-Reservation

  For the class project I have decided on the topic Airline Ticket Reservation System, the basic idea of booking or canceling tickets in two types of flights such as
domestic and international flights with Bridge pattern. For the use case, in an event of editing the name and number of seats in the reserved/booked ticket by implementing Decorator pattern.

• The focus of the project is reserving tickets on domestic and international flights with bridge pattern, Flight as an abstract class which is inherited by Domestic
class and International class. Further it composed to the Ticket interface which is inherited by DomesticTicket class and InternationalTicket class.

• The user case scenario is focused on editing the reserved ticket which is implemented using decorator pattern, The EditDecorator is an abstract class which
is inherited from Flight abstract class and the Name class and Seats class are inheriting the EditDecorator abstract class.

• The flexibility of the implementation is increased by the Flight abstract class and the EditDecorator. Any new type of flights can be added to the system by simply
creating a new class under the Flight abstract class and edit options can be increased by doing the same under EditDecorator.

• The Simplicity and understandability is increased by using abstract classes such as Flight, editDecorator and an interface such as Ticket.

• The duplication of code is avoided using inheritance which helps with the 
association of classes to the Flight abstract class.
