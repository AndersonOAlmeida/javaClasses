package entities;

public class BankAccount {
    public static double Tax = 5.00;

    private String name;
    private Integer accountId;
    private double balance;

    public BankAccount() {  }

    /* setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(int accountId) {
        this.accountId = accountId;
    }

    public void setInitialBalance(double balance) {
        this.balance = balance;
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
        return "Account " + accountId + ", Holder: " + name + ", Balance $" + String.format("%.2f", balance);
    }
}
