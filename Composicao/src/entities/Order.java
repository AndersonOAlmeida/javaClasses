package entities;

import entities.enums.OrderStatus;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    /* Composition */
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

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

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
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
            total += items.getLast().subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + client.getBirthDate() + ") " + " - " + client.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem oi : items) {
            sb.append(oi.getClass() + ", $" + oi.getPrice() + ", Quantity: " + oi.getQuantity() + ", Subtotal: " + oi.subTotal() + "\n");
        }
        sb.append("Total price: " + total());
        return sb.toString();
    }
}
