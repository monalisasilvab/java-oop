package util;

public class CurrencyConverter {
	
	public static double taxIOF = 0.06; 
	
	public static double dollarToReal(double amountPaid, double dollarPrice) {
		return amountPaid * dollarPrice * (1.0 + taxIOF);
	}
	
}
