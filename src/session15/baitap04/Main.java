package session15.baitap04;

public class Main {
    public static void main(String[] args) {

        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("P01", "An", 2));
        queue.addPatient(new EmergencyPatient("P02", "Binh", 1));
        queue.addPatient(new EmergencyPatient("P03", "Cuong", 2));
        queue.addPatient(new EmergencyPatient("P04", "Dung", 1));

        queue.displayQueue();

        System.out.println("Gọi bệnh nhân:");

        EmergencyPatient p = queue.callNextPatient();
        if (p != null) {
            p.display();
        }
    }
}