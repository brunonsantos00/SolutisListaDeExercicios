package questao3;

import java.util.Scanner;

public class TodosPrimosMenoresQueEleMesmo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um valor:");
		valor = scanner.nextInt();
		
		
		for (int i = 2; i < valor; i++) {
            boolean primo = true;
            for (int j = 2; j * j <= i; j++) {
                if (i != j && i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(i);
            }
        }
		
		
		scanner.close();
	}
	
}
