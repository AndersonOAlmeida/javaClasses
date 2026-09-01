package application;

import entities.Order;
import entities.Client;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;


public class Program3 {
    public static void main(String[] args) {
        /* Enunciado */
        /* Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido conforme exemplo
        (próxima página). Nota: o instante do pedido deve ser o instante do sistema: new Date() */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String bdate = sc.nextLine();

        Client client = new Client(name, email, LocalDate.parse(bdate, fmt1));

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        LocalDateTime moment = LocalDateTime.now();

        Order order = new Order(moment, OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int limit = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < limit; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String itemName = sc.nextLine();
            System.out.print("Product price: ");
            double itemPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int itemQuantity = sc.nextInt();
            sc.nextLine();

            OrderItem items = new OrderItem(itemQuantity, itemPrice, new Product(itemName, itemPrice));
            order.addItem(items);
        }

        System.out.println(order.toString());
    }
}
