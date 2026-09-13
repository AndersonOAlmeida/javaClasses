package entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    /* Constructors */
    public ImportedProduct () {}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    /* Getters and Setters */
    public Double getPrice() {
        return super.getPrice() + customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    /* Methods */
    @Override
    public String priceTag() {
        return super.getName() + " $ " + String.format("%.2f", getPrice()) + " (Customs fee: $ " + String.format("%.2f", getCustomsFee()) + ")";
    }

    public Double totalPrice() {
        return getPrice() + getCustomsFee();
    }
}
