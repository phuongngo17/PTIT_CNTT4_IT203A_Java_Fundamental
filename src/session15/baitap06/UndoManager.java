package session15.baitap06;

import java.util.Stack;

public class UndoManager {

    Stack<InputAction> undoStack = new Stack<>();
    int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {

        if (undoStack.size() == maxUndoSteps) {
            undoStack.remove(0);
        }

        undoStack.push(action);
    }

    public InputAction undo() {

        if (!undoStack.isEmpty()) {
            return undoStack.pop();
        }

        return null;
    }
}