package entities;

public abstract class Account {
    /* Conta base, todos os tipos de contas terão esses atributos e métodos dessa classe */

    private Integer number;
    private String holder;
    /* Para que as classes que irão herdar possam ter acesso aos atributos da classe base, deve-se definir esses atributos
    * como protected, que mantém o atributo privado, porém permite o acesso externo de outras classes filhas */
    protected Double balance;

    /* Constructors */
    public Account() {  }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    /* Getters and Setters */

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    /* Methods */

    public void withdraw(Double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(Double amount) {
        balance += amount;
    }
}
