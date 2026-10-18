package application;

import java.io.*;
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

        System.out.print("Enter with the path of file: ");
        String filePath = sc.nextLine();

        File path = new File(filePath);
        String parentPath = path.getParent();
        String outPath = parentPath + "\\out";
        new File(outPath).mkdir();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outPath + "\\summary.csv"))) {
            String line = br.readLine();
            while (line != null) {
                String product[] = line.split(",");
                double val = Double.parseDouble(product[1]);
                int quant = Integer.parseInt(product[2]);
                double finalPrice = val * quant;
                String lines = product[0] + "," + String.format( "%.2f" ,finalPrice);
                bw.write(lines);
                bw.newLine();
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
