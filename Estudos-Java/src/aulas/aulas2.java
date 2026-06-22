package aulas;

public class aulas2 {
	public static void main(String[] args) {
		// Eu não necessáriamente preciso atribuir valores as minhas variáveis no momento da declaração, posso fazer isso depois. Ex:
		int x, y, result;
		
		x = 5;
		y = 3;
		
		result = x + y;
		
		System.out.println(result);
		
		// Exs pra calculo de area de um trapezio
		
		double baseMen, baseMai, altura, area;
		
		baseMen = 6;
		baseMai = 8;
		altura = 5;
		
		area = ((baseMen + baseMai) / 2.0) * altura;
		
		System.out.printf("A area do trapézio é %.2f \n", area);
		
		// para fazer conversão de variaveis no java, eu preciso colocar o tipo de variavel entre parenteses na frente do valor da variavel na declaração, ex:
		
		int a, b;
		double resultado;
		
		// eu também consigo converter esses valores na declaração de variáveis, porém corre o risco de perder alguma informação na conversão
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		
		// sem o (tipo), o java vai interpretar o result como 2.0, e não vai me dar o valor correto de 2.5
		
		System.out.println(resultado);
		
		// o nome utilizado pra essa conversão é *Java Casting*
	}
}
