package questao14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaAritimetica {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Double> valores = new ArrayList<>();
		double somaValores = 0;
		
		int i = 1;
		while(i <= 50) {
			System.out.println("Digite o " + i + "º valor:");
			double valor = scanner.nextInt();
			valores.add(valor);
			somaValores = somaValores + valor;
			i++;
		}
		
		double media = somaValores / 50;
		
		System.out.println("Essa é a media: " + media);
		
		scanner.close();
	}

}
