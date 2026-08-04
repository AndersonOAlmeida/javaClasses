package exercicios.application;

/* Importação das classes utilizadas no programa */
import java.util.Locale;
import java.util.Scanner;
import exercicios.entities.Person;

public class Alturas {
    public static void main(String[] args) {
        /* Enunciado:
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme
        exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar
        também a porcentagem de pessoas com menos de 16 anos, bem como os nomes
        dessas pessoas caso houver. */
        /* Configurando a formatação dos dados inseridos para o estilo americano */
        Locale.setDefault(Locale.US);

        /* Criando uma classe para o usuário inserir as informações */
        Scanner sc = new Scanner(System.in);

        /* Obtendo a quantidade de pessoas que serão inseridas no sistema */
        System.out.print("Quantas pessoas serão digitadas? ");
        int limit = sc.nextInt();

        /* Criando um objeto pessoa baseado na classe Person importada */
        Person[] pessoa = new Person[limit];

        /* Percorrendo cada vetor e inserindo as informações nas classes */
        for(int i = 1; i <= limit; i++) {
            System.out.print("\nDados da " + i + "a pessoa: ");
            System.out.print("\nNome: ");
            names[i] = pessoa.Person(sc.nextLine());
            sc.nextLine();
            System.out.print("Idade: ");
            pessoa.Person(sc.nextInt());
            System.out.print("Altura: ");
            pessoa.Person(sc.nextDouble());
        }

        /* Calculando a altura média das pessoas cadastradas */
        double sumHeights = 0;
        for(int j = 0; j <= heights.length; j++) {
            sumHeights += heights[j];
        }
        double avg = sumHeights / limit;
        System.out.printf("Altura média: %.2f", sumHeights);

        /*  */
    }
}
