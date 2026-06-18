package Deepskilling.week1.DSA.exercise1;

import java.util.*;


import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "ID: " + productId +
               ", Name: " + productName +
               ", Quantity: " + quantity +
               ", Price: " + price;
    }
}

public class InventoryManagement {

    private HashMap<Integer, Product> inventory;

    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added successfully.");
    }

    // Update Product
    public void updateProduct(int productId, int quantity, double price) {

        if (inventory.containsKey(productId)) {

            Product product = inventory.get(productId);

            product.quantity = quantity;
            product.price = price;

            System.out.println("Product updated successfully.");
        }
        else {
            System.out.println("Product not found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {

        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product deleted successfully.");
        }
        else {
            System.out.println("Product not found.");
        }
    }

    // Display Inventory
    public void displayProducts() {

        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {

        InventoryManagement obj = new InventoryManagement();

        // Add products
        obj.addProduct(new Product(101, "Mouse", 50, 450));
        obj.addProduct(new Product(102, "Keyboard", 20, 1000));
        obj.addProduct(new Product(103, "Monitor", 10, 8000));

        System.out.println("\nInventory:");
        obj.displayProducts();

        // Update product
        obj.updateProduct(102, 25, 1200);

        // Delete product
        obj.deleteProduct(101);

        System.out.println("\nInventory after update and delete:");
        obj.displayProducts();
    }
}