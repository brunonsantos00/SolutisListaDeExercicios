package questao12;

import java.util.Scanner;

public class ConsumoGasolina {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int tanquesCheios;
	        double totalQuilometros = 0;
	        double totalLitros = 0;

	        System.out.print("Digite o número de tanques cheios monitorados: ");
	        tanquesCheios = scanner.nextInt();

	        for (int i = 1; i <= tanquesCheios; i++) {
	            System.out.println("Tanque cheio #" + i);
	            
	            System.out.print("Digite a quilometragem dirigida: ");
	            int quilometragem = scanner.nextInt();

	            System.out.print("Digite a quantidade de litros de gasolina utilizados: ");
	            int litrosGasolina = scanner.nextInt();

	            double consumoQuilometrosPorLitro = (double) quilometragem / litrosGasolina;
	            totalQuilometros += quilometragem;
	            totalLitros += litrosGasolina;

	            System.out.println("Consumo quilômetros/litro: " + consumoQuilometrosPorLitro);
	            System.out.println("Quilometragem combinada até agora: " + totalQuilometros);
	            System.out.println("Total de litros de combustível consumidos até agora: " + totalLitros);
	            System.out.println();
	        }

	        scanner.close();
	    }
}





