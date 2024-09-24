package services;

import entities.Product;

public class StockServices {
	
	public static void addProducts(Product product, Integer quantity) {
	    product.setQuantity(product.getQuantity() + quantity);
	}

	public static void removeProducts(Product product, Integer quantity) {
		product.setQuantity(product.getQuantity() - quantity); // to-do programação defensiva
	}
	
	public static double totalValueInStock(Product product) {
		return product.getPrice() * product.getQuantity();
	}
} 
