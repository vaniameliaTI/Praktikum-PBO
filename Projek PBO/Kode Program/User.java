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

public class User {
    private int userId;
    private String name;
    private List<Order> orders = new ArrayList<>();
    private List<Product> wishlist = new ArrayList<>();

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public Order createOrder(List<Product> products) {
        Order newOrder = new Order(orders.size() + 1, this, products);
        orders.add(newOrder);
        return newOrder;
    }

    public void addToWishlist(Product product) {
        wishlist.add(product);
    }

    public String getWishlistUrl() {
        return "/wishlist/" + userId;
    }

    public List<Product> getWishlist() {
        return wishlist;
    }
    
    public String getName() {
        return name;
    }
}


