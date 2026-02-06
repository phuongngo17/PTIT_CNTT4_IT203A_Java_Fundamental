package session09.baitap03;

public class Employee {
    private String employeeName;
    private double salary;

    public Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Tên: " + employeeName);
        System.out.println("Lương cơ bản: " + salary);
    }
}
