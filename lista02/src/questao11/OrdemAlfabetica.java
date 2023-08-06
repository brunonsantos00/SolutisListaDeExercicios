package questao11;

import java.util.Scanner;

public class OrdemAlfabetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String primeiraPalavra = scanner.next();

        System.out.print("Digite a próxima palavra: ");
        String segundaPalavra = scanner.next();

       
        if (primeiraPalavra.compareTo(segundaPalavra) < 0) {
            System.out.println("Palavras em ordem alfabética: " + primeiraPalavra + ", " + segundaPalavra);
        } else {
            System.out.println("Palavras em ordem alfabética: " + segundaPalavra + ", " + primeiraPalavra);
        }

        
        if (primeiraPalavra.length() > segundaPalavra.length()) {
            System.out.println("A palavra com maior número de caracteres é: " + primeiraPalavra);
        } else if(primeiraPalavra.length() < segundaPalavra.length()){
            System.out.println("A palavra com maior número de caracteres é: " + segundaPalavra);
        }else {
        	System.out.println("Elas tem o mesmo número de caracteres");
        }

        scanner.close();
    }
}

