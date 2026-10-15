package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        /* Manipulando arquivos com Java */
        Scanner sc = new Scanner(System.in);

        /* Passando o caminho de uma pasta para o Java */
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        /* Nessa linha, o java cria uma lista e coloca todas as pastas, verificando todas as pastas existentes no caminho informado com
         * a expressão lambda isDirectory */
        File[] folders = path.listFiles(File::isDirectory);
        /* Listando as pastas com o foreach */
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        /* Da mesma forma que criamos a lista com as pastas existentes, conseguimos também criar uma lista com os arquivos */
        File[] files = path.listFiles(File::isFile);
        /* Listando arquivos no foreach */
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        /* Aqui, criamos uma pasta no caminho, passando o nome e usando o método mkdir() */
        boolean success = new File(strPath + "\\subdir").mkdir();
        /* Retornando uma mensagem de sucesso */
        System.out.println("Directory created sucessfully: " + success);

        sc.close();
    }
}
