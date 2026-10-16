package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Exercise1 {
    public static void main(String[] args) {
        /* Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. Cada item possui um nome, preço
         * unitário e quantidade, separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv", localizado em uma subpasta
         * chamada "out" a partir da pasta original do arquivo de origem, contendo apenas o nome e o valor total para aquele item (preço
         * unitário multiplicado pela quantidade), conforme exemplo. */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String filePath = "c:\\temp\\exs\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while (line != null) {
                String product[] = line.split(",");
                System.out.println(product);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
