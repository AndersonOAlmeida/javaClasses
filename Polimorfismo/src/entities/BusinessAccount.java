package entities;

/* Como explicado no arquivo program, para dizer que essa BusinessAccount herda as propriedades da classe Account, é necessário
* dizer que BusinessAccount EXTENDS Account */
public class BusinessAccount extends Account {
    public static double tax = 10.00;

    private Double loanLimit;

    /* Constructors */
    /* o item super() faz referência aos itens que o construtor da classe base */
    public BusinessAccount () {
        super();
    }

    /* Ex: eu não preciso recriar todos as atribuições de number, holder e balance, eu apenas escrevo super e referencio
    * as atribuições, e ela faz esse trabalho todo em uma linha */
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
            balance += (amount - tax);
        }
    }

    @Override
    public void withdraw(Double amount) {
        /* o item super também pode fazer referência a um método específico da classe base, nesse caso, eu estou reutilizando toda a lógida de desconto do
        * saque da classe base, e adicionando um desconto adicional de 2.00 */
        super.withdraw(amount);
        balance -= 2.00;
    }
}
