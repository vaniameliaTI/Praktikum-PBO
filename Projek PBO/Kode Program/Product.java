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

public class Product {
    private int productId;
    private String name;
    private double price;
    private String description;
    private int stock;
    private Category category;
    private List<Review> reviews = new ArrayList<>();

    public Product(int productId, String name, double price, String description, int stock, Category category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public List<Review> getReviews() {
        return reviews;
    }
}


