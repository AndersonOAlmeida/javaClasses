package application;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import entities.Account;
import entities.Employee;
import entities.OutsorcedEmployee;
import entities.SavingsAccount;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        /* Exercício Resolvido: */
        /* Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se regsitrar nome, horas trabalhadas e valor por hora.
        * Funcionários terceirizados possuem ainda uma despesa adicional.
        * O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda recebem
        * um bônus correspondente a 110% da sua despesa adicional.
        * Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los numa lista. Depois de ler todos os dados, mostrar
        * nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
        * Construa o programa conforme projeto ao lado. Veja exemplo na próxima página. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if (outsourced == 'n') {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            } else {
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();
                sc.nextLine();

                Employee emp = new OutsorcedEmployee(name, hours, valuePerHour, charge);
                list.add(emp);
            }
        }

        System.out.println("\nPAYMENTS");
        for (Employee emp : list) {
            System.out.println(emp.toString());
        }

        sc.close();
    }
}
