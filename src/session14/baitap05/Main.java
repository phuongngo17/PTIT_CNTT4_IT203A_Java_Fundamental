package session14.baitap05;


import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Comparator<Patient> comparator = new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                if (p1.getSeverity() != p2.getSeverity()) {
                    return p1.getSeverity() - p2.getSeverity();
                }

                return p1.getArrivalTime() - p2.getArrivalTime();
            }
        };

        TreeSet<Patient> patients = new TreeSet<>(comparator);

        patients.add(new Patient("Bệnh nhân A", 3, 800));
        patients.add(new Patient("Bệnh nhân B", 1, 815));
        patients.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("Thứ tự xử lý:");

        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}
