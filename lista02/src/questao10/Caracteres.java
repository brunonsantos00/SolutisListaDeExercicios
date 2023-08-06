package questao10;

import java.util.Scanner;

public class Caracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma cadeia de caracteres: ");
        String texto = scanner.nextLine();

        int vogais = countVogais(texto);
        int espacos = countEspacos(texto);
        int consoantes = countConsoantes(texto);

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de espaços em branco: " + espacos);
        System.out.println("Quantidade de consoantes: " + consoantes);

        scanner.close();
    }

    public static int countVogais(String texto) {
        return texto.toLowerCase().replaceAll("[^aeiou]", "").length();
    }

    public static int countEspacos(String texto) {
        return texto.replaceAll("[^ ]", "").length();
    }

    public static int countConsoantes(String texto) {
        return texto.toLowerCase().replaceAll("[aeiou ]", "").length();
    }
}
