package poly.assignment.model;

public class CartItem {
    private String productName;
    private double price;
    private int quantity;

    public CartItem() {
        // Constructor rỗng để Spring/Thymeleaf/Jackson có thể khởi tạo tự động
    }

    public CartItem(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter & Setter
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Tính tổng tiền = price * quantity
    public double getTotal() {
        return this.price * this.quantity;
    }
}
