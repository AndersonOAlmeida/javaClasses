package application;

import java.util.Scanner;
import java.util.Locale;
import model.entities.Account;
import model.exceptions.AccountException;

public class Program1 {
    public static void main(String[] args) {
        /* Exercício de Fixação */
        /* Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, mostrando o novo saldo. Um saque
         * não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de saque da conta. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Initial balance: ");
        double accountBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double limitValue = sc.nextDouble();

        Account acc = new Account(accountNumber, accountHolder, accountBalance, limitValue);

        System.out.print("\nEnter amount for withdraw: ");
        double withdrawAmount = sc.nextDouble();
        try {
            acc.withdraw(withdrawAmount);
            System.out.print(acc);
        } catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
