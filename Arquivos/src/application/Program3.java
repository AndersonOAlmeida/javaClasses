package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) {
        /* Utilizando a base do último programa (Program2) para fins de comparação, esse programa
         * irá mostrar uma forma mais simples de resolver os problemas sem que o código fique mais
         * extenso, usando o bloco try-with-resources */

        String path = "c:\\temp\\ina.txt";

        /* Para reduzir o tamanho do código, podemos instanciar os streams DIRETAMENTE no try, retirando também a obrigatoriedade
         * do uso de variáveis e do bloco finally, tornando o código BEM mais enxuto e compacto */
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
