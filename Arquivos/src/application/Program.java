package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /* Com java, conseguimos ler arquivos, com algumas classes. */
        /* A classe File, que representa o arquivo e seu caminho de forma abstrata */
        /* Com a linha abaixo, instaciamos um objeto do tipo File, e esse objeto encapsula todo o processo de acessar o aquivo e o
         * arquivo em si */
        File file = new File("c:\\temp\\in.txt");
        /* Utilizando o Scanner, podemos usar ele para ler os dados do arquivo, utilizando o polimorfismo da classe Scanner */
        /* Para nossa variavel sc ter um valor inicial, iniciamos ela como null temporariamente */
        Scanner sc = null;

        /* Instanciando o Scanner a partir do arquivo, o programa tentará abrir o arquivo e o java pode acabar gerando uma IOException,
         * que é uma Exception (exceção que exige o tratamento obrigatório), então somos obrigados a fazer essa instanciação dentro do try
         * para que nós possamos tratar a exceção no catch */
        try {
            /* Para que o Scanner possa ler o conteúdo do arquivo, devemos usar o file como argumento */
            sc = new Scanner(file);
            /* Caso exista uma próxima linha no arquivo */
            while (sc.hasNextLine()) {
                /* O programa imprime essa linha na tela */
                System.out.println(sc.nextLine());
            }
        /* Tratando uma possível exceção do arquivo */
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        /* Se ocorrer do programa cair na exceção e executar o que está no catch, o Scanner ficará aberto, então, por uma boa prática,
         * é ideal que colocamos o sc.close no bloco finally */
        } finally {
            /* Porém, se colocar apenas o sc.close() no finally, ele pode dar um NullPointerException, pois o meu sc foi instanciado
             * inicialmente como null, então é necessária uma validação desse sc, para que, caso ele não seja nulo, ele feche normalmente
             * o recurso */
            if (sc != null) {
                sc.close();
            }
        }
    }
}
