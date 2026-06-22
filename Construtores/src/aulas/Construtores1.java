package aulas;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Construtores1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/* quando setamos um objeto dessa forma, a maquina virtual seta um objeto como vazio, com seus atributos em null e 0
		 * ex: faz sentido ter um produto sem nome e sem preço? não, então o construtor ajuda com esse questionamento, lá
		 * no código da classe tem a explicação */
		// Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Stock quantity: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		
		System.out.println(product.toString());

		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());

		System.out.println("Updated data!");
		System.out.println(product.toString());

		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());

		System.out.println("Updated data!");
		System.out.print(product.toString());

		sc.close();
	}
}
