package entities;

/* Palavra final: ela funciona tanto para métodos, quanto para classes, suponhamos que eu tenha uma subclasse final que eu não quero ou que não precise
 * de outra subclasse derivada dela, eu uso a palavra final para indicar ao compilador que não é permitido criar uma subclasse a partir dessa classe aqui */
public /* final */ class SavingsAccount extends Account {
    private Double interestRate;

    /* Constructors */
    public SavingsAccount () { super(); }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    /* Getters and Setters */
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    /* Methods */
    public void updateBalance() {
        balance += (balance * interestRate);
    }

    /* Sobreposição de métodos: é necessário utilizar o @Override acima dos métodos sobrepostos, para que o compilador saiba
    * e identifique qual método da superclasse está sendo sobreposto, caso eu escreva o nome do método errado (witdraw sem h por exemplo)
    * o compilador consegue identificar e me mostrar que o nome da função está errada */
    /* Como dito antes, ela funciona também para métodos, suponhamos também que essa classe aqui seja superclasse de uma SavingsAccountPlus, caso eu precise
    * bloquear uma segunda sobreposição desse método (ou seja, que eu precise sobrescrever esse método, que já é uma sobreposição), eu preciso inserir a palavra
    * final aqui (o que é recomendado, pois a sobreposição de um método em cima de outra sobreposição, abre brechas para inconsistências no código) */
    @Override
    public final void withdraw(Double amount) {
        balance -= amount;
    }
}
