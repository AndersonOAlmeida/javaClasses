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
        sc.nextLine(); // Limpa o Enter do nextInt() acima

        /* Criando um vetor pessoa baseado na classe Person importada */
        Person[] pessoa = new Person[limit];

        /* Percorrendo cada vetor e inserindo as informações nas classes */
        for (int i = 0; i < limit; i++) {
            System.out.print("\nDados da " + (i + 1) + "a pessoa: ");
            System.out.print("\nNome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();
            pessoa[i] = new Person(name, age, height);
        }

        /* Calculando a altura média das pessoas cadastradas */
        double sumHeights = 0;
        for (int j = 0; j < pessoa.length; j++) {
            sumHeights += pessoa[j].getHeight();
        }
        double avg = sumHeights / limit;
        System.out.printf("\nAltura média: %.2f", avg);

        /* Calculando a porcentagem de pessoas menores de 16 anos */
        double percent = 0.0;
        int counter = 0;
        for (int k = 0; k < pessoa.length; k++) {
            int personAge = pessoa[k].getAge();
            if (personAge < 16) {
                counter++;
            }
        }
        percent = (100 * (double) counter) / limit;
        System.out.print("\nPessoas com menos de 16 anos: " + percent + "% \n");
        for (int l = 0; l < pessoa.length; l++) {
            int personAge = pessoa[l].getAge();
            if (personAge < 16) {
                String personName = pessoa[l].getName();
                System.out.println(personName);
            }
        }
    }
}