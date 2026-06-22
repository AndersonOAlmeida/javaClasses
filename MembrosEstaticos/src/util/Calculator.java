package util;

public class Calculator {
	/* o final aqui, seta a variável como um valor absoluto, basicamente, esse valor de pi não poderá ser adulterado
	   no decorrer do código, esse é literalmente o valor final de pi */
	public static final double PI = 3.14159;
	
	/* Estes metodos tem que ser setados como static por que o java nao permite usar dados que não sejam static em outros
	métodos static */
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
