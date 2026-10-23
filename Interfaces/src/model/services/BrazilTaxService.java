package model.services;

public class BrazilTaxService {
    /* Methods */
    public double tax(Double amount) {
        /* Calculo de imposto baseado no valor final do aluguel */
        if (amount <= 100.00) {
            return amount * .2;
        } else {
            return amount * .15;
        }
    }
}
