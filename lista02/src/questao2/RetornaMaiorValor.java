package questao2;

import java.util.Scanner;

public class RetornaMaiorValor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valorA;
		int valorB;
		
		System.out.println("Digite o valorA: ");
		valorA = scanner.nextInt();
		
		System.out.println("Digite o valorB: ");
		valorB = scanner.nextInt();
		

		if(valorA > valorB) {
			System.out.println(valorA + " é o maior valor" );
		}else{
			System.out.println(valorB + " é o maior valor");
			}
	
		scanner.close();
	}
		
}


