package questao11;

import java.util.Scanner;

public class RetornaProduto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int codigoProduto;
		
		System.out.println("Digite o codigo do produto:");
		codigoProduto = scanner.nextInt();
		
		
		if(codigoProduto == 001) {
			System.out.println("Parafuso");
			
		}else if(codigoProduto == 002) {
			System.out.println("Porca");
			
		}else if(codigoProduto == 003) {
			System.out.println("Prego");
			
		}else {
			System.out.println("Diversos");
		}
		
		scanner.close();
	}

}
