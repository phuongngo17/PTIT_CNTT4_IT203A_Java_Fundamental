package session15.baitap06;

import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {

    Queue<Ticket> ticketQueue = new LinkedList<>();
    int currentNumber = 0;

    public void issueTicket(String time) {
        currentNumber++;
        Ticket t = new Ticket(currentNumber, time);
        ticketQueue.add(t);
    }

    public Ticket callNext() {
        if (!ticketQueue.isEmpty()) {
            return ticketQueue.poll();
        }
        return null;
    }
}