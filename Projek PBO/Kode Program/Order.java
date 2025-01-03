/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VannStore;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private User user;
    private List<Product> products = new ArrayList<>();
    private String status = "Pending";
    private boolean isWishlist = false;

    public Order(int orderId, User user, List<Product> products) {
        this.orderId = orderId;
        this.user = user;
        this.products.addAll(products);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void completeOrder() {
        this.status = "Completed";
    }

    public void markAsWishlist() {
        this.isWishlist = true;
        this.status = "Wishlist";
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getStatus() {
        return status;
    }
}