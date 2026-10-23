package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;
import java.time.LocalDateTime;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService bts;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService bts) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.bts = bts;
    }

    public void processInvoice(CarRental cr) {
        double minutes = Duration.between(cr.getStart(), cr.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = bts.tax(basicPayment);

        cr.setInvoice(new Invoice(basicPayment, tax));
    }
}
