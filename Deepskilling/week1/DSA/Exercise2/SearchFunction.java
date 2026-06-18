package Deepskilling.week1.DSA.Exercise2;

import java.util.Arrays;
import java.util.Comparator;

class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + category;
    }
}

public class SearchFunction {

    // Linear Search
    public static int linearSearch(Product[] products, String key) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].productName.equalsIgnoreCase(key))
                return i;
        }

        return -1;
    }

    // Binary Search
    public static int binarySearch(Product[] products, String key) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int result = products[mid].productName.compareToIgnoreCase(key);

            if (result == 0)
                return mid;

            else if (result < 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Mouse", "Electronics"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(103, "Laptop", "Electronics"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Electronics")
        };

        String key = "Laptop";

        // Linear Search
        int index1 = linearSearch(products, key);

        if (index1 != -1)
            System.out.println("Linear Search: Product found at index " + index1);
        else
            System.out.println("Product not found.");

        // Sort array for Binary Search
        Arrays.sort(products,
                Comparator.comparing(p -> p.productName));

        int index2 = binarySearch(products, key);

        if (index2 != -1)
            System.out.println("Binary Search: Product found at index " + index2);
        else
            System.out.println("Product not found.");
    }
}
