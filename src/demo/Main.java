package demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Ürünlerin oluşturulması
		Product product1 = new Product("Computer", 750, 3);
        Product product2 = new Product("Phone", 500, 2);

        // Ürünlerin ekrana yazdırılması
        product1.display();
        System.out.println();
        product2.display();

        // Ürünlerin bir listeye eklenmesi
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);

        // Toplam bakiyenin hesaplanması ve ekrana yazdırılması
        double totalBalance = ProductHelper.getTotalBalance(productList);
        System.out.println("\nTotal Balance (including 20% VAT): $" + totalBalance);
    }

	}


