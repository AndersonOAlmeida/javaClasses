package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;
import java.time.LocalDateTime;

public class RentalService {
    /* Attributes */
    private Double pricePerHour;
    private Double pricePerDay;

    /* Compositions */
    private BrazilTaxService bts;

    /* Constructors */
    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService bts) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.bts = bts;
    }

    /* Methods */
    public void processInvoice(CarRental cr) {
        /* Calculando a diferença de tempo em minutos */
        double minutes = Duration.between(cr.getStart(), cr.getFinish()).toMinutes();
        /* Transformando a diferença de minutos em horas */
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12) {
            /* Fazendo o cálculo do pagamento sem imposto caso o período dê apenas algumas horas */
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            /* Fazendo o cálculo do pagamento sem imposto caso o período dê um período de dias */
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        /* Adicionando o valor da taxa */
        double tax = bts.tax(basicPayment);

        cr.setInvoice(new Invoice(basicPayment, tax));
    }
}
