package application;

import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Program2 {
    public static void main(String[] args) {
        /* Enunciado */
        /* Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostrar a etiqueta de preço
        * de cada produto na mesma ordem em que foram digitados. */
        /* Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de
        * fabricação. Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo. Para produtos importados,
        * a taxa e alfândega deve ser acrescentada ao preço final do produto. */
        /* Favor implementar o programa conforme projeto ao lado */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Product> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            if (type == 'c') {
                Product p = new Product(name, price);
                list.add(p);
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();
                LocalDate manDate = LocalDate.parse(date, fmt);

                Product p = new UsedProduct(name, price, manDate);
                list.add(p);
            } else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                Product p = new ImportedProduct(name, price, customsFee);
                list.add(p);
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product x : list) {
            System.out.println(x.priceTag());
        }

        sc.close();
    }
}
