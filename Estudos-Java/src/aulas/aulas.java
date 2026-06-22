package aulas;

import java.util.Locale; // import da biblioteca Locale para setar o local de referencia da instancia do java (setada por padrao a mesma do computador)

public class aulas {
	public static void main(String[] args) {
		// declaração de variáveis
		// tipo nome = valor
		String nome = "dessao";
		int idade = 23; // int, byte, long e short para valores inteiros
		double altura = 1.783; // double e float para valores "quebrados"
		String salve = "aoba!"; // String para valores alfanumericos (palavras), para valores com apenas uma letra, 
		// pode se usar char (char usa aspas simples, strings usam aspas duplas)
		boolean ehvdd = false; // boolean para valores booleanos (true ou false)
		
		
		System.out.println(salve);
		System.out.println("Você tem " + idade + " anos");
		System.out.printf("E tem %.2f m de altura%n", altura); // printf formata a saida da variavel baseada na 
		// formatação inserida, neste caso, para 2 casas após o ponto flutuante, tem que ser indicada a variavel fora 
		// das aspas, e depois da virgula 
		
		// também é possível colocar varias variaveis em um printf, colocando as marcações e as variaveis respectivamente
		// em ordem
		
		System.out.printf("%s tem %.2f m de altura e %d anos de idade \n", nome, altura, idade);
		// %s para strings, %f para numeros quebrados, %d para numeros inteiros e %n ou \n para quebra de linha
		
		
		System.out.println("\n \n \n Exercício de fixação: \n \n \n");
		//produtos
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f \n", product1, price1);
		System.out.printf("%s, which price is $ %.2f \n \n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s \n \n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f \n", measure);
		System.out.printf("Rouded (three decimal places): %.3f \n", measure);
		Locale.setDefault(Locale.US); // forma de setar a localidade, neste caso, usará medidas de referencia do USA (virgulas em numeros quebrados viram ponto e tals)
		System.out.printf("US decimal point: %.3f", measure);
	}
}
