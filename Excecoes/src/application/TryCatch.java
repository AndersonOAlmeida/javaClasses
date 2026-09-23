package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    /* Bloco try: */
    /* Contém o código que representa a execução normal do trecho de código que PODE acarretar numa exceção */

    /* Bloco catch: */
    /* Contém o código a ser executado caso uma exceção ocorra */
    /* Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido) */

    /* Demo */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Código executado no começo */
        try {
            /* Criando um vetor, capturando os nomes escritos pelo usuário, e os separando pelo espaço */
            String[] vect = sc.nextLine().split(" ");
            /* Capturando a posição do vetor que o usuário quer descobrir */
            int position = sc.nextInt();
            /* Imprimindo na tela o nome que o usuário solicitou pela posição no vetor */
            System.out.println(vect[position]);
        /* Caso o programa acima termine num erro de indexação, ou seja, caso o usuário solicite um índice que não exista. Ex:
         * caso o usuário insira 3 nomes (lembrando que um vetor começa a contar de 0, ou seja, 0, 1 e 2), e solicite um index
         * maior que 3 (5, por exemplo), o programa vai gerar um erro de ArrayIndexOutOfBoundsException, e cair nesse primeiro catch,
         * escrevendo na tela a mensagem de posição inválida */
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        /* Caso o usuário insira um erro de input (escreva uma letra invés de um número na hora de solicitar o index do nome), o
         * compilador gera a exceção de InputMismatchException e retornar a mensagem de erro de input */
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }

        /* Sem o try catch que criamos, o programa gera o erro e encerra o restante da execução do código. Com a estrutura, o programa
         * consegue continuar a execução e mostrar essa mensagem de "Fim do programa!". */
        System.out.println("End of program!");

        sc.close();
    }
}
