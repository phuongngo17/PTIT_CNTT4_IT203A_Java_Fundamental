package session15.baitap05;

public class Main {

    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient("P01", "An");
        EmergencyCase case1 = new EmergencyCase(p1);

        case1.addStep(new TreatmentStep("Tiếp nhận", "10:00"));
        case1.addStep(new TreatmentStep("Chẩn đoán", "10:05"));
        case1.addStep(new TreatmentStep("Điều trị", "10:10"));

        queue.addCase(case1);

        EmergencyCase current = queue.getNextCase();

        current.displaySteps();

        System.out.println("Undo bước gần nhất:");

        current.undoStep();

        current.displaySteps();
    }
}