package session13.baitap04;

import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> queue;

    public EmergencyRoom() {
        queue = new LinkedList<>();
    }

    public void patientCheckIn(String name) {
        queue.addLast(name);
        System.out.println("Bệnh nhân thường đến: " + name);
    }

    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
        System.out.println("Ca cấp cứu nguy kịch: " + name);
    }

    public void treatPatient() {
        if (!queue.isEmpty()) {
            String patient = queue.removeFirst();
            if (patient.startsWith("C")) {
                System.out.println("Đang cấp cứu: " + patient);
            } else {
                System.out.println("Đang khám: " + patient);
            }
        } else {
            System.out.println("Không còn bệnh nhân trong danh sách.");
        }
    }

    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}
