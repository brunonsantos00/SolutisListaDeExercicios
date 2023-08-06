package questao9;

import java.util.Scanner;

public class CalculoAreaCirculo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);			
		
		
		System.out.println("Digite a area do ciruclo: ");
		double raio = scanner.nextDouble();
		
		double area = 3.14 * raio * raio; 
		System.out.println("O valor da area = " + area);
		
		scanner.close();
	}

}
