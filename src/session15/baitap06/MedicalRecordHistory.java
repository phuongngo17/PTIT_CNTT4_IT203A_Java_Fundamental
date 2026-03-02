package session15.baitap06;

import java.util.Stack;

public class MedicalRecordHistory {

    Stack<EditAction> editStack = new Stack<>();
    String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public EditAction undoEdit() {
        if (!editStack.isEmpty()) {
            return editStack.pop();
        }
        return null;
    }
}