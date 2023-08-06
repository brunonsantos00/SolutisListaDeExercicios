package questao8;

import java.util.Scanner;

public class VerificaParOuImpar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor:");
		valor = scanner.nextInt();	
		
		if(valor % 2 == 0) {
			System.out.println(valor + " é par" );
		}else {
			System.out.println(valor + " é impar");
	}
		scanner.close();

}
}