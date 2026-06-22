package aulas;
// Entrada de dados
// Para conseguir colocar a entrada de dados no java, é necessario importar a biblioteca Scanner, da seguinte forma:
import java.util.Scanner;

public class aulas3 {
	public static void main(String[] args) {
		
		// E atribuir o scanner a uma variável, assim:
		Scanner sc = new Scanner(System.in);
		
		// para inserir dados de tipo string, usa se sc.next();
		// para dados int, sc.nextInt()
		// para double, sc.nextDouble();
		// para dados char, é necessário usar a função .charAt(index do array)
		
		String name;
		char sexo;
		int x;
		double quebrado;
		
		name = sc.next();
		x = sc.nextInt();
		quebrado = sc.nextDouble();
		sexo = sc.next().charAt(0);
		sc.nextLine(); // o nextLine solto, logo abaixo de uma entrada de dados, captura a quebra de linha que a inserção de dados normal tem, quando eu coloco
		// um nexline abaixo de uma atribuição normal, o primeiro nextLine captura a quebra de linha do capturador que veio antes, e fica faltando uma inserção por
		// causa disso no programa
		
		// Agora, o método para ler linhas, é diferente, por que o sc.next() lê apenas a primeira palavra, ja para ler uma linha, com varias palavras, é necessário 
		// usar o sc.nextLine()
		
		String fr1;
		
		fr1 = sc.nextLine();
		
		System.out.printf("Você digitou:\n Nome: %s\n Sexo: %s\n Inteiro: %d\n double: %.2f\n", name, sexo, x, quebrado);
		System.out.print("Sua frase é: " + fr1);
		
		// E quando eu nao usar mais o Scanner, eu preciso fechar ela com sc.close()
		sc.close();
	}
}
