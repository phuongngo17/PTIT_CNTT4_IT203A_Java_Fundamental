package session13.baitap06;

public class Medicine {
    private String drugId;
    private String drugName;
    private double unitPrice;
    private int quantity;

    public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getDrugId() {
        return drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return unitPrice * quantity;
    }

    public void display() {
        System.out.printf("%-10s %-20s %-10.0f %-10d %-10.0f\n",
                drugId, drugName, unitPrice, quantity, getTotalPrice());
    }
}