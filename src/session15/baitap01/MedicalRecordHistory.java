package session15.baitap01;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history = new Stack<>();
    public MedicalRecordHistory(){
        history = new Stack<>();
    }

    public void addEdit(EditAction action){
        history.push(action);
    }
    public EditAction undoEdit(){
            if(!history.isEmpty()){
                return history.pop();
            }
            return null;
    }
    public EditAction getLatestEdit() {
        if (!history.isEmpty()) {
            return history.peek();
        }
        return null;
    }
    public boolean isEmpty(){
           return history.isEmpty();
    }
    public void displayHistory(){
            if(history.isEmpty()){
                System.out.println("K có lịch sử nào chỉnh sửa");
            }else{
                System.out.println("Danh sách chỉnh sửa: ");
                for(EditAction action : history){
                    System.out.println(action);
                }
            }
    }
}
