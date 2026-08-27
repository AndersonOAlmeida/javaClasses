package entities;

import entities.enums.OrderStatus;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate moment;
    private OrderStatus status;

    /* Composition */
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    /* Getters and Setters */

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
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

    public Order(LocalDate moment, OrderStatus status) {
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

    /* public Double total() {

    } */
}
