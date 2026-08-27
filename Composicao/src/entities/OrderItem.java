package entities;

import entities.Product;

public class OrderItem {
    /* Attributes */
    private Integer quantity;
    private Double price;

    /* Compositions */
    private Product product;

    /* Getters and Setters */
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /* Constructors */
    public OrderItem() {}

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    /* Methods */
    public Double subTotal() {
        return price * quantity;
    }
}
