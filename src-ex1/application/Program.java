package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import services.StockServices;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product Data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		
		StockServices.addProducts(product, add);
		
		System.out.println(product + "\n");
		
		System.out.print("Enter the number of products to be removed in stock: ");
		int remove = sc.nextInt();
		
		StockServices.removeProducts(product, remove);
		
		System.out.println(product);
		
		
		sc.close();

	}

}
