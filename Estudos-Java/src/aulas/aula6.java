package aulas;
import java.util.Scanner;

public class aula6 {
	public static void main(String[] args) {
		//Estruturas condicionais
		
		// isso aqui é só pra vc ter uma ideia da sintaxe das condicionais no java
		
		int x;
		x = 7;
		
		// estrutura if else
		if (x < 5) {
			System.out.println("X é menor que 5");
		} else if (x == 5) {
			System.out.println("X é 5");
		} else {
			System.out.println("X é maior que 5");
		}
		
		// estrutura switch case
		
		int num;
		String dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("que dia eh hoje?");
		num = sc.nextInt();
		sc.close();
		
		switch (num) {
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terça";
				break;
			case 4:
				dia = "quarta";
				break;
			case 5:
				dia = "quinta";
				break;
			case 6:
				dia = "sexta";
				break;
			case 7:
				dia = "sabado";
				break;
			default:
				dia = "valor invalido";
				break;
		}
		
		System.out.printf("Dia da semana: %s\n", dia);
		
		// operador ternário em java
		
		double preco, desconto;
		
		preco = 60.0;
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.printf("Seu desconto é de R$%.2f" , desconto);
	}
}
