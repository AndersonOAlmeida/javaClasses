package exercicio;

/* imports */
import entities.BankAccount;
import java.util.Locale;
import java.util.Scanner;

public class exercicioFixacao {
    /* Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da
    * conta e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial,
    * entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o
    * depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero
    *
    * Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome do
    * titular pode ser alterado (pois uma pessoa pode mudar o nome por ocasião do casamento, por exemplo).
    *
    * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo
    * só aumenta por meio de depósitos e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa
    * $5.00. Nota: a conta pode ficar com um saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar
    * a taxa
    *
    * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não informado o valor
    * de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação. */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount conta = new BankAccount();

        System.out.print("Enter account number: ");
        conta.setAccount(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter account holder: ");
        conta.setName(sc.nextLine());
        System.out.print("Is there an initial deposit (y/n)? ");
        String answer = sc.next();

        if (answer.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            conta.setInitialBalance(sc.nextDouble());

            System.out.println("\nAccount data:");
            System.out.println(conta.toString());

            System.out.print("\nEnter a deposit value: ");
            conta.deposit(sc.nextDouble());
            System.out.println("Updated account data:");
            System.out.println(conta.toString());

            System.out.print("\nEnter a withdraw value: ");
            conta.withdrawal(sc.nextDouble());
            System.out.println("Updated account data: ");
            System.out.println(conta.toString());
        } else {
            System.out.println("\nAccount data:");
            System.out.println(conta.toString());

            System.out.print("\nEnter a deposit value: ");
            conta.deposit(sc.nextDouble());
            System.out.println("Updated account data:");
            System.out.println(conta.toString());

            System.out.print("\nEnter a withdraw value: ");
            conta.withdrawal(sc.nextDouble());
            System.out.println("Updated account data: ");
            System.out.println(conta.toString());
        }
    }
}
