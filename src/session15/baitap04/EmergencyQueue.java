package session15.baitap04;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    Queue<EmergencyPatient> emergencyQueue = new LinkedList<>();
    Queue<EmergencyPatient> normalQueue = new LinkedList<>();

    public void addPatient(EmergencyPatient p) {
        if (p.getPriority() == 1) {
            emergencyQueue.add(p);
        } else {
            normalQueue.add(p);
        }
    }

    public EmergencyPatient callNextPatient() {

        if (!emergencyQueue.isEmpty()) {
            return emergencyQueue.poll();
        }

        if (!normalQueue.isEmpty()) {
            return normalQueue.poll();
        }

        return null;
    }

    public void displayQueue() {

        System.out.println("Danh sách cấp cứu:");
        for (EmergencyPatient p : emergencyQueue) {
            p.display();
        }

        System.out.println("Danh sách thông thường:");
        for (EmergencyPatient p : normalQueue) {
            p.display();
        }
    }
}