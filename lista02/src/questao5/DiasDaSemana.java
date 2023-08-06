package questao5;

import java.util.Scanner;

public class DiasDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diasDaSemana = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo" };

        System.out.println("Digite um número de 1 a 7:");
        int valor = scanner.nextInt();

        if (valor >= 1 && valor <= 7) {
            String diaDaSemana = diasDaSemana[valor - 1];
            System.out.println("Esse dia é: " + diaDaSemana);
        } else {
            System.out.println("Não existe esse valor na semana");
        }

        scanner.close();
    }
}
