package questao4;

import java.util.Scanner;

public class ConverterKMemMilha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final double multiplicador = 1.609;
		double milhas;
		double milhasEmKm;
		
		System.out.println("Digite a quantia de milhas:");
		milhas = scanner.nextInt();
		
		milhasEmKm = milhas * multiplicador;
		
		System.out.println("o valor de " + milhas + " milhas convertido em km são "+ milhasEmKm + " KM");
		
		scanner.close();
	}
	
}
