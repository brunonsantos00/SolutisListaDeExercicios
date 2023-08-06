package questao15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaAritmeticaComDoWhile {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        List<Double> valores = new ArrayList<>();
        double somaValores = 0;

        int i = 1;
        do {
            System.out.println("Digite o " + i + "º valor:");
            double valor = scanner.nextDouble();
            valores.add(valor);
            somaValores += valor;
            i++;
        } while (i <= 50);

        double media = somaValores / 50;

        System.out.println("Essa é a média: " + media);
        
        scanner.close();
    }
}
