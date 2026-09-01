package entities;

import entities.enums.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    /* Composition */
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    /* Formatters */
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter bdayFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /* Getters and Setters */

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /* Constructors */
    public Order() {}

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    /* Methods */
    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

     public Double total() {
        double total = 0;
        for (OrderItem st : items) {
            total += st.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY: \n");
        sb.append("Order moment: " + fmt.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + client.getBirthDate().format(bdayFmt) + ") " + " - " + client.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem oi : items) {
            sb.append(oi.getProduct().getName() + ", $" + String.format("%.2f", oi.getPrice()) + ", Quantity: " + oi.getQuantity() + ", Subtotal: $" + String.format("%.2f", oi.subTotal()) + "\n");
        }
        sb.append("Total price: " + String.format("%.2f", total()));
        return sb.toString();
    }
}
