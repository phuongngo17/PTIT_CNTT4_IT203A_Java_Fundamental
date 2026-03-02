package session15.baitap05;

import java.util.Stack;

public class EmergencyCase {

    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
    }

    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            return steps.pop();
        }
        return null;
    }

    public void displaySteps() {

        System.out.println("Bệnh nhân: " + patient.getName());

        for (TreatmentStep s : steps) {
            s.display();
        }
    }

    public Patient getPatient() {
        return patient;
    }
}