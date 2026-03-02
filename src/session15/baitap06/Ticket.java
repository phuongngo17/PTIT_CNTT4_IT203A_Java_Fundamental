package session15.baitap06;

public class Ticket {

    int ticketNumber;
    String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    public void display() {
        System.out.println("Ticket: " + ticketNumber + " - " + issuedTime);
    }
}