package session15.baitap05;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases = new LinkedList<>();

    public void addCase(EmergencyCase c) {
        cases.add(c);
    }

    public EmergencyCase getNextCase() {

        if (!cases.isEmpty()) {
            return cases.poll();
        }

        return null;
    }
}