package entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    /* Getters and Setters */
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    /* Constructors */
    public Company () { super(); }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    /* Methods */
    @Override
    public Double tax() {
        double t;

        if (numberOfEmployees < 10) {
            t = super.anualIncome * 0.16;
        } else {
            t = super.anualIncome * 0.14;
        }

        return t;
    }
}
