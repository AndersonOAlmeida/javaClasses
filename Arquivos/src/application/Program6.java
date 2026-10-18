package application;

import java.io.File;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        /* Como coletar informações do caminho do arquivo */
        Scanner sc = new Scanner(System.in);

        /* Passando o caminho completo do arquivo */
        System.out.println("Enter a file path");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        /* Coletando apenas o nome do arquivo */
        System.out.println("getName: " + path.getName());
        /* Coletando o caminho do arquivo sem o nome */
        System.out.println("getParent: " + path.getParent());
        /* Coletando o caminho completo do arquivo (caminho + nome do arquivo) */
        System.out.println("getPath: " + path.getPath());

        /* A classe File tem métodos variados para as informações de um caminho passado */
        /* Exemplo: essa função verifica se o arquivo existe no caminho informado */
        System.out.println("O arquivo existe? " + path.exists());
        sc.close();
    }
}
