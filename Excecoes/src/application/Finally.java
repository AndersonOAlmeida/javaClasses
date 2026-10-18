package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {
    /* Bloco finally: */
    /* O bloco finally é um bloco que contém o código a ser executado independentemente de ter ocorrido uma execução ou não */
    /* Exs: fechar um arquivo, encerrar conexão com o banco de dados ou outro recurso específico ao final do processamento. */

    /* Demo: */
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Bloco Finally executado");
        }
    }
}
