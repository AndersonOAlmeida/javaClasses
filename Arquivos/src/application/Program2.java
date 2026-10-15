package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
    public static void main(String[] args) {
        String path = "c:\\temp\\in.txt";
        /* A classe FileReader é um stream (sequencia) de leitura de caracteres a partir de arquivos */
        FileReader fr = null;
        /* A classe BufferedReader é instanciado a partir o FileReader e implementa otimizações utilizando o buffer de memória */
        BufferedReader br = null;

        /* Implementação básica, de forma manual */
        /* Tentando abrir e ler o arquivo */
        try {
            /* Estabelecendo uma sequência de leitura a partir do caminho do arquivo */
            fr = new FileReader(path);
            /* BufferedReader é uma abstração que parte do FileReader, que usa a sequência que o FR ja abriu e lê de uma forma mais
             * rápida, usando o buffer */
            br = new BufferedReader(fr);

            /* Outra forma de instanciar o BufferedReader: br = new BufferedReader(new FileReader(path)) */

            /* O método readLine() lê uma linha do arquivo, e se o arquivo estiver no final, ele retorna null */
            String line = br.readLine();
            /* Para ler todas as linhas do arquivo, eu faço o laço while da seguinte forma: */
            while (line != null) {
                /* Printando a linha na tela */
                System.out.println(line);
                /* Lendo a próxima linha */
                line = br.readLine();
            }
        /* Capturando uma possível exceção e mostrando o erro */
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        /* Para podermos fechar as streams, independentemente se o arquivo ser lido com sucesso ou ter feito um erro, devemos setar um
         * bloco finally */
        } finally {
            /* Na hora de fechar os streams, TAMBÉM podem ocorrer exceções, então o compilador vai nos obrigar a tratar essas exceções.
             * Então devemos colocar o fechamento dentro do try */
            try {
                /* Verificando se o BufferedReader e o FileReader estão diferentes de null para podermos fechá-los */
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            /* Caso tenha uma exceção no fechamento das streams, definimos um catch para mostrar detalhadamente o erro ocorrido */
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
