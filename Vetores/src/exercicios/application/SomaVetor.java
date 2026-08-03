package exercicios.application;

/* Importando as classes que serão utilizadas no programa */
import java.util.Scanner;
import java.util.Locale;

public class SomaVetor {
    public static void main(String[] args) {
        /* Faça um programa que leia N números reais e armazene-os em um vetor.
        Em seguida:
            - Imprimir todos os elementos do vetor
            - Mostrar na tela a soma e a média dos elementos do vetor */
        /* Utilizando a formatação americana de valores flutuantes (invés de vírgula,
         * o sistema utiliza ponto [10,00 -> 10.00]) */
        Locale.setDefault(Locale.US);

        /* Definindo uma variável para entrada de dados pelo usuário */
        Scanner sc = new Scanner(System.in);

        /* Obtendo o número limite do vetor e criando o vetor */
        System.out.print("Quantos números você vai digitar? ");
        int limit = sc.nextInt();
        double[] list = new double[limit];

        /* Percorrendo e adicionando valores no vetor */
        for (int i = 0; i < limit; i++) {
            System.out.print("Digite um número: ");
            list[i] = sc.nextDouble();
        }

        /* Mostrando os valores armazenados no vetor */
        System.out.print("\nVALORES = ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }

        /* Somando os valores do vetor e imprimindo na tela */
        double sum = 0;
        for (int k = 0; k < list.length; k++) {
            sum += list[k];
        }
        System.out.printf("\nSOMA = %.2f", sum);

        /* Tirando a média dos valores e imprimindo na tela */
        double media = sum / limit;
        System.out.printf("\nMEDIA = %.2f", media);
    }
}
