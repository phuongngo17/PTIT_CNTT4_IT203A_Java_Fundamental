package session15.baitap06;

public class InputAction {

    String fieldName;
    String oldValue;
    String newValue;
    String actionTime;

    public InputAction(String fieldName, String oldValue, String newValue, String actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }
}