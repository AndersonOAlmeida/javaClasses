package aulas;
import java.util.Scanner;

public class aulas5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		
		System.out.print("Digite o valor de a: ");
		a = sc.nextDouble();
		
		System.out.print("\nDigite o valor de b: ");
		b = sc.nextDouble();
		
		System.out.print("\nDigite o valor de c: ");
		c = sc.nextDouble();
		sc.close();
		
		delta = (Math.pow(b, 2.0)) - 4 * a * c;
		
		x1 = -b + (Math.sqrt(delta)) / (2 * a);
		x2 = -b - (Math.sqrt(delta)) / (2 * a);
		
		if (delta < 0) {
			System.out.print("Não existem raízes reais");
		} else {
			System.out.printf("O valor de x1 é: %.2f\n", x1);
			System.out.printf("O valor de x2 é: %.2f\n", x2);
		}
	}
}
