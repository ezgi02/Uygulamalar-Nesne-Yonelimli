package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	  private String name;
	    private double price;
	    private int quantity;
	    private Date createdAt;
	    public Product() {
	        this("Unknown", 0, 1);
	    }

	    public Product(String name) {
	        this(name, 0, 1);
	    }

	    public Product(String name, double price) {
	        this(name, price, 1);
	    }
	    public Product(String name, double price, int quantity) {
	        this.name = validateName(name);
	        this.price = validatePrice(price);
	        this.quantity = validateQuantity(quantity);
	        this.createdAt = new Date();
	    }
	    private String validateName(String name) {
	        if (name.length() >= 3 && name.length() <= 8) {
	            return name;
	        } else {
	            throw new IllegalArgumentException("Name must be between 3 and 8 characters long.");
	        }
	    }
	    private double validatePrice(double price) {
	        if (price >= 0) {
	            return price;
	        } else {
	            throw new IllegalArgumentException("Price cannot be negative.");
	        }
	    }
	    private int validateQuantity(int quantity) {
	        if (quantity >= 1) {
	            return quantity;
	        } else {
	            throw new IllegalArgumentException("Quantity must be at least 1.");
	        }
	    }
	    public double getTotalPrice() {
	        return price * quantity;
	    }

	    public void display() {
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        System.out.println("Product Name: " + name);
	        System.out.println("Price: $" + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total Price: $" + getTotalPrice());
	        System.out.println("Created At: " + sdf.format(createdAt));
	    }

}
