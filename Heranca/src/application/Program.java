package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        /* Conceito de Herança */
        /* É um tipo de associação que permite que uma classe herde todos os dados e comportamentos de outra. */
        /* Definições importantes: é uma relação é-um, no exemplo, a conta empresarial é um tipo de conta */
        /* a classe Account é uma generalização (uma classe genérica) e a BusinessAccount é uma especialização (uma classe específica) */
        /* a classe Account é uma Superclasse (classe base) e a BusinessAccount é uma subclasse (classe derivada) */
        /* a classe BusinnesAccount extende a classe Account, ou seja, ela tem tudo que Account tem, porém, com os seus atributos
        * e métodos próprios */
        /* Herança é uma associação entre classes, então quando eu instancio um objeto BusinessAccount, eu tenho todos os atributos
        * de Account, e não que eu teria dois objetos diferentes de cada classes */
        /* Vantagens: reuso e polimorfismo */
        /* Sintaxe: classA extends classB */

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.00);

        // UPCASTING
        /* Upcasting é a atribuição de subclasses num objeto da superclasse, já que uma conta empresarial ou poupança é uma conta,
        * o java identifica e consegue atribuir essa subclasse na superclasse */
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.00, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.00, 0.01);

        // DOWNCASTING
        /* Downcasting é o efeito contrario, de atribuir uma superclasse numa subclasse, porém, downcasting não funciona por si só, é necessário
        * passar por uma validação antes de fazer essa conversão */

        /* Por mais que acc2 seja um upcasting de uma BusinessAccount, o compilador não consegue identificar ela como uma BusinessAccount porque a variável
        * acc2 foi declarada como uma Account, então eu preciso de fazer uma conversão inserindo o tipo entre parêntesis antes da variável */
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

        /* Para fazer conversão de uma subclasse em outra subclasse, eu preciso de fazer uma validação, por que o compilador nem sempre identifica
        * pelo código que esse objeto vai funcinar */
        // BusinessAccount acc5 = (BusinessAccount) acc3; // isso aqui por si só não funciona

        // validação de downcasting
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
