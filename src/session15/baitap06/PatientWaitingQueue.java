package session15.baitap06;

import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {

    Queue<Patient> waitingQueue = new LinkedList<>();
    int totalPatients = 0;

    public void addPatient(Patient p) {
        waitingQueue.add(p);
        totalPatients++;
    }

    public Patient callNextPatient() {
        if (!waitingQueue.isEmpty()) {
            totalPatients--;
            return waitingQueue.poll();
        }
        return null;
    }
}