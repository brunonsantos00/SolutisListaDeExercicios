package questao8;

import java.util.Scanner;

public class RetornaPalavra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = null;

        System.out.println("Escreva uma palavra: ");
        palavra = scanner.next(); 
        palavra = palavra.toLowerCase();
        StringBuilder buffer = new StringBuilder(palavra);
        buffer.reverse();
        
        System.out.println(buffer);

        if (palavra.equals(buffer.toString())) {
            System.out.println("Essa palavra é um palíndromo.");
        } else {
            System.out.println("Essa palavra não é um palíndromo.");
        }

        scanner.close();
    }
}
