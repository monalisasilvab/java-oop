package introduction_to_oop;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Main4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought?");
		double amountPaid = sc.nextDouble();
		
		double total = CurrencyConverter.dollarToReal(amountPaid, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", total);
		
		sc.close();
	}

}
