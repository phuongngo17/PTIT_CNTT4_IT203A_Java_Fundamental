package session06.baitap03;

public class Product {
    private String productId;
    private String productName;
    private double productPrice;

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        if(productPrice <= 0 ){
            System.out.println("Giá sản phẩm không hợp lệ");
            return;
        }
        this.productPrice = productPrice;
    }

    public void displayProduct() {
        System.out.println("Mã sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá sản phẩm: " + productPrice);
    }
}
