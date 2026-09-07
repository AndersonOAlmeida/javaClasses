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

    public Product getProduct() {
        return product;
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

    @Override
    public String toString() {
        return getProduct().getName() + ", $" + String.format("%.2f", getPrice()) + ", Quantity: " + getQuantity() + ", Subtotal: $" + String.format("%.2f", subTotal()) + "\n";
    }
}
