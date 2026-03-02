package session15.baitap05;

public class TreatmentStep {

    private String description;
    private String time;

    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    public void display() {
        System.out.println(time + " - " + description);
    }
}