package questao7;

import java.util.Scanner;

public class TrocarValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA;
        int valorB;

        System.out.println("Digite qualquer valor para valorA");
        valorA = scanner.nextInt();

        System.out.println("Digite qualquer valor para valorB");
        valorB = scanner.nextInt();

        System.out.println("Antes da troca: valorA = " + valorA + " e valorB = " + valorB);

        trocaValor(valorA, valorB);
        
        scanner.close();
    }

    public static void trocaValor(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores foram trocados: valorA = " + a + " e valorB = " + b);
        
    }
    
}
