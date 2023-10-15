package demo;

import java.util.List;

public class ProductHelper {
    public static Product createItemFromText(String text) {
        String[] attributes = text.split(",");
        if (attributes.length == 3) {
            String name = attributes[0];
            double price = Double.parseDouble(attributes[1]);
            int quantity = Integer.parseInt(attributes[2]);
            return new Product(name, price, quantity);
        } else {
            throw new IllegalArgumentException("Invalid input format in the text file.");
        }
    }

    public static double getTotalBalance(List<Product> productList) {
        double totalBalance = 0;
        for (Product product : productList) {
            totalBalance += product.getTotalPrice();
        }
        totalBalance *= 1.2; // Apply 20% VAT
        return totalBalance;
    }
}

