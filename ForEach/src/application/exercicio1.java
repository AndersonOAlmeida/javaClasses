package application;

import java.util.*;

import entities.Employee;

public class exercicio1 {
    public static void main(String[] args) {
        /* Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salário) de N funcionários. Não deve haver
        * repetição de id.
        * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário. Para isso, o programa deve ler um id
        * e o valor X.Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizda
        * dos funcionários, conforme exemplos.
        * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente. Um salário só
        * pode ser aumentado com base em uma operação de aumento por porcentagem dada. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantityEmployees = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantityEmployees; i++) {
            System.out.println("\nEmployee #0" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int seachId = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        sc.close();
    }
}
