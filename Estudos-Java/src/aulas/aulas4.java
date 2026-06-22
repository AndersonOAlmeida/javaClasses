package aulas;
import java.util.Scanner;
// operações matemáticas com java

public class aulas4 {
	public static void main(String[] args) {
		// Java tem como fazer operações matemáticas mais complexas com a propriedade Math, da seguinte forma:
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		// para conseguirmos fazer raiz quadrada, conseguimos usar o Math.sqrt(valor);
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raízes usando Math.sqrt()");
		System.out.println("A raiz quadrada da variável x é: " + A);
		System.out.println("A raiz quadradao da variável y é: " + B);
		System.out.println("A raiz quadrada de 25 é: " + C);
		System.out.println("-------------------- // --------------------");
		
		// Podemos também fazer exponenciação / potenciação com o método Math.pow(base, expoente);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println("Potenciação / Exponenciação usando Math.pow()");
		System.out.println("Valor de " + x + " elevado a " + y + ": " + A);
		System.out.println("Valor de " + x + " ao quadrado: " + B);
		System.out.println("Valor de 5 ao quadrado: " + C);
		System.out.println("-------------------- // --------------------");
		
		// Por fim, conseguimos também o valor absoluto (ou módulo, em termos matemáticos), com a propriedade
		// Math.abs(valor);
		
		A = Math.abs(x);
		B = Math.abs(z);
		System.out.println("Valores absolutos / Módulos usando Math.abs()");
		System.out.println("O valor absoluto de " + x + " é " + A);
		System.out.println("O valor absoluto de " + z + " é " + B);
		System.out.println("-------------------- // --------------------");
		
		// Com métodos de Math, podemos fazer algumas equações mais complexas, como a fórmula de bhaskara
		// ex de fixação: calculadora de bhaskara
		
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		double delta, x1, x2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = (Math.pow(b, 2.0)) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("Fórmula de bhaskara com os métodos de Math");
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);
	}
}
