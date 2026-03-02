package session15.baitap02;

public class Main {
    public static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();
        patientQueue.addPatient(new Patient("BN001", "Nguyen Van A", 30));
        patientQueue.addPatient(new Patient("BN002", "Tran Thi B", 25));
        patientQueue.addPatient(new Patient("BN003", "Le Van C", 40));

         patientQueue.displayQueue();

         System.out.println("Bệnh nhân tiếp theo: " + patientQueue.peekNextPatient());

         System.out.println("Gọi khám: " + patientQueue.callNextPatient());

        patientQueue.displayQueue();
    }
}