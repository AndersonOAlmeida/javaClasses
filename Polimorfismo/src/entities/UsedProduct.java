package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate manufatureDate;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /* Constructors */
    public UsedProduct () {}

    public UsedProduct(String name, Double price, LocalDate manufatureDate) {
        super(name, price);
        this.manufatureDate = manufatureDate;
    }

    /* Getters and Setters */
    public LocalDate getManufatureDate() {
        return manufatureDate;
    }

    public void setManufatureDate(LocalDate manufatureDate) {
        this.manufatureDate = manufatureDate;
    }

    @Override
    public String priceTag() {
        return super.getName() + " (used) $ " + super.getPrice() + " (Manufacture date: " + getManufatureDate().format(fmt) + ")";
    }
}
