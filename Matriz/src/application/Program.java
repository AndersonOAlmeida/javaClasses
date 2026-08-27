package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        /* Enunciado:
        * Fazer um programa para ler dois números M e N, e depois ler uma matriz de M linhas e N colunas contendo números inteiros,
        * podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os
        * à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo. */

        /* criando uma variável para ler as informações inseridas pelo usuário */
        Scanner sc = new Scanner(System.in);
        /* utilizando o padrão americano de formatação para números flutuantes */
        Locale.setDefault(Locale.US);

        /* número limite de linhas */
        int rows = sc.nextInt();
        /* número limite de colunas */
        int columns = sc.nextInt();

        /* criando uma matriz com os limites de linhas e colunas definidas anteriormente */
        int[][] mat = new int[rows][columns];

        /* percorrendo as linhas da matriz */
        for (int i = 0; i < mat.length; i++) {
            /* percorrendo as colunas da matriz */
            for (int j = 0; j < mat[i].length; j++) {
                /* inserindo valores na matriz */
                mat[i][j] = sc.nextInt();
            }
        }

        /* variável para buscar o item da matriz */
        int search = sc.nextInt();

        /* percorrendo novamente as linhas da matriz */
        for (int i = 0; i < mat.length; i++) {
            /* percorrendo novamente as colunas da matriz */
            for (int j = 0; j < mat[i].length; j++) {
                /* fazendo a pesquisa, validando se o valor inserido na pesquisa é igual ao item da matriz */
                if (search == mat[i][j]) {
                    /* mostrando a posição do item pesquisado na matriz */
                    System.out.println("Position " + i + "," + j + ":");
                    /* verificando se existe um item do lado esquerdo do item pesquisado */
                    if (j - 1 >= 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    /* verificando se existe um item acima do item pesquisado */
                    if(i - 1 >= 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    /* verificando se existe um item do lado direito do item pesquisado */
                    if (j + 1 < mat[i].length) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    /* verificando se existe um item abaixo do item pesquisado */
                    if (i + 1 < mat.length) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }
    }
}
