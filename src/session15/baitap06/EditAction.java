package session15.baitap06;

public class EditAction {

    String description;
    String editedBy;
    String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    public void display() {
        System.out.println(editTime + " - " + description + " - by " + editedBy);
    }
}