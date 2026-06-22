package aulas;
import java.util.Scanner;

public class aula7 {
	public static void main(String[] args) {
		// estruturas de repetição em java
		
		// estrutura while
		// usa-se while quando NÃO se sabe a quantidade de repetições que será realizada no processo
		
		Scanner sc = new Scanner(System.in);
		String resposta = "sim";
		int x = sc.nextInt();
		
		while (x != 0) {
			x = sc.nextInt();
			System.out.println("Digite 0 para sair!");
			if(x == 0) { System.out.println("saiu"); }
		}
		
		// estrutura for
		// usa-se o for quando se tem uma noção de quantas rep serão realizadas no processo
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i<N; i++) {
			int y = sc.nextInt();
			soma += y;
		}
		System.out.println(soma);
		
		// estrutura do while
		
		char resp;
		float celsius, farenheint;
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			celsius = sc.nextFloat();
			
			farenheint = ((celsius * 9) / 5) + 32;
			
			System.out.printf("Equivalente em Fahrenheint: %.1f \n", farenheint);
			System.out.println("Deseja continuar? ");
			resp = sc.next().charAt(0);
		} while (resp == 's');
		
		sc.close();
	}
}
