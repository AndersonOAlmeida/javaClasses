package util;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double Calculator(double dollar, double quant) {
		return quant * dollar * (1.0 * IOF);
	}
}
