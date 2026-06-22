package application;

import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class DollarCalc {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will br bought? ");
		double quant = sc.nextDouble();
		
		double result = CurrencyConverter.Calculator(dollar, quant);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
	}
}
