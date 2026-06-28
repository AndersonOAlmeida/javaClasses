package aula;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Encapsulamento {
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
        Product encapsulamento = new Product(name, price, quantity);

        /* Para podermos acessar atributos privados, agora precisamos dos métodos já criada em product, e chamá-la
         * por aqui diretamente da variável, e assim se repete com os outros atributos do objeto */
        encapsulamento.setName("Computer");
        System.out.println("Updated name: " + encapsulamento.getName());
        encapsulamento.setPrice(1200.00);
        System.out.println("Updated data: " + encapsulamento.getPrice());


        System.out.println(encapsulamento.toString());

        System.out.print("Enter the number of products to be added in stock: ");
        encapsulamento.addProducts(sc.nextInt());

        System.out.println("Updated data!");
        System.out.println(encapsulamento.toString());

        System.out.print("Enter the number of products to be removed from stock: ");
        encapsulamento.removeProducts(sc.nextInt());

        System.out.println("Updated data!");
        System.out.print(encapsulamento.toString());

        sc.close();
    }
}
