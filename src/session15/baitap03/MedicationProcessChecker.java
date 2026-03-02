package session15.baitap03;

import java.util.Stack;

public class MedicationProcessChecker {
     Stack<String> stack = new Stack<>();
    public boolean checkProcess(String[] actions){
        for(int i = 0; i < actions.length; i++){
            if(actions[i].equals("Push")){
                stack.push("Medicine");
            }else if(actions[i].equals("Pop")) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public void reset(){
        stack.clear();
    }
}
