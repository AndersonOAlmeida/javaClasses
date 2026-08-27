package exercicios.application;

/* Importando as classes utilizadas no programa */
import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        /* Enunciado:
         Faça um programa que leia N números inteiros e armazene-os em um vetor.
         Em seguida, mostre na tela todos os números pares, e também a quantidade de
         números pares. */

        /* Configurando o sistema de formatação para o sistema americano */
        Locale.setDefault(Locale.US);

        /* Criando um objeto scanner para inserção de dados do usuário */
        Scanner sc = new Scanner(System.in);

        /* Definindo o limite do vetor */
        System.out.print("Quantos números você vai digitar? ");
        int limit = sc.nextInt();

        /* Criando o vetor com base no número limite definido */
        int[] vect = new int[limit];

        /* Criando o loop para inserir os números */
        for (int i = 0; i < limit; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        /* Verificando, mostrando e contando os números pares no loop */
        System.out.println("\nNÚMEROS PARES: ");
        int count = 0;
        for (int j = 0; j < vect.length; j++) {
            int pair = vect[j];
            if (pair % 2 == 0) { // verificação se o número é par
                System.out.print(pair + "  "); // exibindo os números pares
                count++; // contando a quantidade de números pares
            }
        }
        System.out.print("\nQUANTIDADE DE PARES: " + count);

        sc.close();
    }
}
