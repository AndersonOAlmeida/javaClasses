package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
    public static void main(String[] args) {
        /* Da mesma forma que temos FileReader e BufferedReader para ler arquivos, também conseguimos escrever arquivos, com outra
         * classe */
        /* FileWriter: cria o arquivo se não existir/recria o arquivo zerado se ele já existir: */
        // FileWriter fw = new FileWriter(path);
        /* e também pode acrescentar a um arquivo já existente, no final do arquivo */
        // FileWriter fw = new FileWriter(path, true);

        /* O BufferedWriter tem a mesma lógica de ser mais rápido, igual ao BufferedReader, só muda que agora ele escreve o arquivo
         * e não o lê */

        /* Vetor com os itens que serão escritos no arquivo */
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        /* Caminho do arquivo a ser criado */
        String path = "c:\\temp\\out.txt";

        /* Criando/editando o arquivo (para alternar, apenas remover o true) */
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            /* Fazendo um foreach, percorrendo cada linha */
            for (String line : lines) {
                /* Escrevendo cada linha no arquivo */
                bw.write(line);
                /* Fazendo a quebra de linha */
                bw.newLine();
            }
        /* Capturando uma possível exceção de leitura/criação de arquivo */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
