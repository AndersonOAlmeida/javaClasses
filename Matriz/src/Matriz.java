import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        /* Matriz é o nome dado a arranjos bidimensionais, ou seja, é basicamente um
        * arranjo de arranjos (array de arrays ou vetor de vetores).
        * Como visto antes, array é uma estrutura de dados homogêneas, ordenadas e alocada
        * de uma vez só, em um bloco contíguo de memória.
        * Vantagens: acesso imediato aos elementos pela sua posição.
        * Desvantagens: Matrizes tem um tamanho fixo e existe uma dificuldade de se realizar
        * inserções e deleções (o que não se aplica, porque é raro ter que inserir um
        * elemento no meio da matriz). */

        /* Exercício resolvido:
        * Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo
        * números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de
        * valores negativos da matriz. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /* Para indicar pro java que o arranjo será bidimensional (uma matriz), é necessário
         * iniciar a variável igual a um vetor, porém com dois colchetes */
        int[][] mat = new int[n][n];

        /* percorrendo as linhas do array */
        for (int i = 0; i < mat.length; i++) {
            /* percorrendo as colunas do array */
            for (int j = 0; j < mat[i].length; j++) {
                /* setando cada item da matriz, setando a linha e a coluna [i][j] */
                mat[i][j] = sc.nextInt();
            }
        }

        /* verificando a diagonal principal da matriz */
        System.out.println("Main diagonal: ");
        /* percorrendo a diagonal */
        for (int i = 0; i < mat.length; i++) {
            /* utilizando o valor de i para percorrer a diagonal (ex: 1x1, 2x2, 3x3) */
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        /* variavel para contar o numero de números negativos na matriz */
        int count = 0;
        /* percorrendo cada linha da matriz */
        for (int i = 0; i < mat.length; i++) {
            /* percorrendo cada coluna da matriz */
            for (int j = 0; j < mat[i].length; j++) {
                /* verificando se o número dentro da matriz é negativo (menor que 0) */
                if(mat[i][j] < 0) {
                    /* incrementando na contagem */
                    count++;
                }
            }
        }
        /* imprimindo a conta dos números negativos */
        System.out.println("Negative numbers: " + count);
    }
}
