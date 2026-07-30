package exercicios.application;

// imoprts das funções usadas, scanner e locale
import java.util.Scanner;
import java.util.Locale;

public class Negativos {
    public static void main(String[] args) {
        /* setando o local para estados unidos, para usar o sistema métrico
         * e de valores americanos (inves de 10,00, usa 10.00) */
        Locale.setDefault(Locale.US);

        /* setando uma variável para ler as informações inseridas pelo usuário */
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números você vai digitar? ");
        int limit = sc.nextInt();
        int[] list = new int[limit];

        if(limit > 0 && limit <= 10) {
            int i;
            for (i = 0; i < limit; i++) {
                System.out.print("Digite um numero: ");
                list[i] = sc.nextInt();
            }
            System.out.println("NUMEROS NEGATIVOS: ");
            for (int k = 0; k < list.length; k++) {
                if (list[k] < 0) {
                    System.out.print(list[k]);
                }
            }
        } else {
            System.out.print("Insira um valor menor que 10!");
        }
    }
}
