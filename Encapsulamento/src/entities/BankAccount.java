package entities;

public class BankAccount {
    public static double Tax = 5.00;

    private String name;
    private Integer accountId;
    private double balance;

    public BankAccount(int accountId, String name) {
        this.name = name;
        this.accountId = accountId;
    }

    public BankAccount(int accountId, String name, double initialDeposit) {
        this.name = name;
        this.accountId = accountId;
        deposit(initialDeposit);
    }

    /* setters */
    public void setName(String name) {
        this.name = name;
    }

    /* getters */
    public String getName() {
        return name;
    }

    public int getAccount() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    /* methods */
    public void withdrawal(double saque) {
        balance -= (saque + Tax);
    }

    public void deposit(double deposito) {
        balance += deposito;
    }

    public String toString() {
        return "\nAccount data:\nAccount: " + getAccount() + ", Holder: " + getName() + ", Balance $" + String.format("%.2f", getBalance());
    }
}
