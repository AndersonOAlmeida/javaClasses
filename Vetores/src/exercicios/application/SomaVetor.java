package exercicios.application;

/* Importando as classes que serão utilizadas */
import java.util.Scanner;
import java.util.Locale;

public class SomaVetor {
    public static void main(String[] args) {
        /* Enunciado:
        * Faça um programa que leia N números reais e armazene-os num vetor. Em seguida:
        * - Imprimir todos os elementos do vetor.
        * - Mostrar na tela a soma e a média dos elementos do vetor. */

        /* Definindo o sistema de formatação de valores para os valores dos Estados Unidos */
        Locale.setDefault(Locale.US);

        /* criando um objeto scanner para leitura de informações inseridas pelo usuário */
        Scanner sc = new Scanner(System.in);

        /* armazenando os números limites do vetor */
        System.out.print("Quantos números você vai digitar? ");
        int limit = sc.nextInt();

        /* criando o array */
        double[] vect = new double[limit];

        /* inserindo valores no array */
        for(int i = 0; i < limit; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        /* percorrendo os valores para mostrá-los na tela */
        System.out.print("VALORES: ");
        for(int j = 0; j < vect.length; j++) {
            System.out.print(vect[j] + ", ");
        }

        /* somando os valores do array */
        System.out.print("SOMA: ");
        double sum = 0;
        for(int k = 0; k < vect.length; k++) {
            sum = vect[k]+=vect[k];
            System.out.println(sum);
        }

        /* fazendo a media dos valores do array */
        System.out.print("MEDIA: ");
        for(int l = 0; l < vect.length; l++) {
            double media = sum / vect.length;
        }
    }
}
