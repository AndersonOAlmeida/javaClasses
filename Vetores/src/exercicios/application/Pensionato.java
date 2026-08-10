package exercicios.application;

import java.util.Scanner;
import java.util.Locale;
import exercicios.entities.Rooms;

public class Pensionato {
    public static void main(String[] args) {
        /* Enunciado: */
        /* A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses
        * quartos identificados pelos números de 0 a 9.
        * Fazer um programa que inicia com todos os quartos vazios, e depois leia uma quantidade
        * de N representando o número de estudantes que vão alugar os quartos (N pode ser de
        * 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel,
        * informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9).
        * Suponha que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um
        * relatório de todas as ocupações do pensionato, por ordem de quarto, conforme exemplo */

        // Criando uma variável para entrada de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Definindo a formatação dos números para o sistema americano (ponto no lugar de vírgula)
        Locale.setDefault(Locale.US);

        // Definindo um valor limite para o vetor
        System.out.print("How many rooms will be rented? ");
        int limit = sc.nextInt();
        sc.nextLine(); // Limpando o Enter do nextInt()

        // Criando uma classe-vetor com 10 itens apenas
        Rooms[] r = new Rooms[10];

        // Validando se o limit está dentro dos valores especificados pelo enunciado
        if (limit > 0 && limit <= 10) {
            // percorrendo cada item do vetor para guardar as informações
            for(int i = 0; i < limit; i++) {
                System.out.println("\nRent #" + (i + 1));
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Room: ");
                int room = sc.nextInt();
                sc.nextLine(); // Limpando o Enter do nextInt()

                // Criando um item no vetor, específico para o índice selecionado pelo usuário
                r[room] = new Rooms(name, email, room);
            }

            // Mostrando os quartos ocupados
            System.out.print("Busy rooms:");
            // Percorrendo novamente o array baseado no tamanho do array
            for (int j = 0; j < r.length; j++) {
                if(r[j] != null) {
                    System.out.print(r[j].toString());
                }
            }
        } else {
            // Caso o usuário insira um limite maior ou menor que o especificado, o sistema encerra
            System.out.println("Invalid limit, shutting down.");
        }
    }
}
