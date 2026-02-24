package session10.baitap05;

public class Manager extends Employee implements BonusCalculator{
    private double bonus;
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        if (bonus < 0) {
            throw new IllegalArgumentException("Thưởng không được âm");
        }
        this.bonus = bonus;
    }
    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBonus();
    }
}
