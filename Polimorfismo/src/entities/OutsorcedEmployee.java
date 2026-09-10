package entities;

public class OutsorcedEmployee extends Employee {
    private Double additionalCharge;

    /* Constructors */
    public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final Double payment() {
        return super.payment() + (additionalCharge * 1.1);
    }

    /* toString */
    public String toString() {
        return getName() + " - $" + payment();
    }
}
