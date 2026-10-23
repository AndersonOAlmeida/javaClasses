package model.services;

public class BrazilTaxService {
    public double tax(Double amount) {
        if (amount <= 100.00) {
            return amount * .2;
        } else {
            return amount * .15;
        }
    }
}
