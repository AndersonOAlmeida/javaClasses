package entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    /* Constructors */
    public BusinessAccount () {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    /* Getters and Setters */

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    /* Methods */
    public void loan(Double amount) {
        if (amount <= loanLimit){
            balance += (amount - 10.00);
        }
    }
}
