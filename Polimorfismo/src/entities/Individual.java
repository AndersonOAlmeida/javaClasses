package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    /* Getters and Setters */
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    /* Constructors */
    public Individual () { super(); }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    /* Methods */
    @Override
    public Double tax() {
        double t;

        if (super.anualIncome < 20000.00) {
            t = super.anualIncome * 0.15;
        } else {
            t = super.anualIncome * 0.25;
        }

        if (healthExpenditures != null) {
            t-= healthExpenditures / 2;
        }

        return t;
    }
}
