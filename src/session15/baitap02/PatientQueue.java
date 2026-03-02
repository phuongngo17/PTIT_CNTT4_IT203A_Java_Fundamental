package session15.baitap02;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;
    public PatientQueue(){
        queue = new LinkedList<>();
    }
    public void addPatient(Patient p){
        queue.add(p);
    }
    public Patient callNextPatient(){
        return queue.poll();
    }
    public Patient peekNextPatient(){
        return queue.peek();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void displayQueue(){
        if(queue.isEmpty()){
            System.out.println("không có bệnh nhận");
        }else{
            System.out.println("Danh sách bệnh nhân: ");
            for(Patient p : queue){
                System.out.println(p);
            }
        }
    }
}
