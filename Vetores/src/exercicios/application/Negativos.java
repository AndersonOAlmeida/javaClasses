package exercicios.application;

// importando as classes que serão usadas, scanner e locale
import java.util.Scanner;
import java.util.Locale;

public class Negativos {
    public static void main(String[] args) {
        /* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor.
        * Em seguida, mostrar na tela todos os números negativos lidos. */

        /* Mudando as convenções de números para o padrão americano, invés de vírgula (R$ 10,00), ele usa ponto ($ 10.00) */
        Locale.setDefault(Locale.US);

        /* criando um objeto scanner para ler as informações inseridas pelo usuário */
        Scanner sc = new Scanner(System.in);

        /* lendo a quantidade de números que serão inseridos no array */
        System.out.print("Quantos números você vai digitar? ");
        int limit = sc.nextInt();

        /* Criando um vetor de números inteiros, com o limite informado antes */
        int[] list = new int[limit];

        /* Verificando se o limite está entre 1 e 10 */
        if(limit > 0 && limit <= 10) {
            /* Inserindo item por item dentro da lista original, passando valor por valor nessa lista */
            for (int i = 0; i < limit; i++) {
                System.out.print("Digite um numero: ");
                list[i] = sc.nextInt();
            }
            /* percorre o vetor original e verifica quais itens são negativos para imprimir na tela */
            System.out.println("NUMEROS NEGATIVOS: ");
            for (int k = 0; k < list.length; k++) {
                if (list[k] < 0) {
                    System.out.println(list[k]);
                }
            }
        /* caso o limite for maior que 10, ele cai nesse else e finaliza o programa */
        } else {
            System.out.print("Insira um valor entre 1 e 10!");
        }

        sc.close();
    }
}
