package session10.baitap05;

public abstract class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Lương cơ bản phải > 0");
        }
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public abstract double calculateSalary();
}
