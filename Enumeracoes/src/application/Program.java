package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        /* Enumerações */
        /* Definição: enumeração é um tipo que serve para especificar de forma literal um conjunto de constantes relacionadas, usada
        * com a palavra-chave enum. A vantagem de uma enumeração é a legibilidade, a melhor semântica e o auxílio do compilador */
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
