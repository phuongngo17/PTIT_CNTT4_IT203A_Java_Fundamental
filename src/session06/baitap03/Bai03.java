package session06.baitap03;

public class Bai03 {
    public static void main(String[] args) {
        Product pr = new Product();
        pr.setProductId("001");
        pr.setProductName("LaptopHp");

        pr.setProductPrice(20000000);

        pr.setProductPrice(-14000000);

        pr.displayProduct();
    }
}
