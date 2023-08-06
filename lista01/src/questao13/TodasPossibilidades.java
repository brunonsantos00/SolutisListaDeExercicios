package questao13;

public class TodasPossibilidades {

	public static void main(String[] args) {
		
		int resultadoSoma = 7;
		
		for(int valorA = 0; valorA <= 7; valorA++) {
			for(int valorB = 0; valorB <= 7; valorB++) {
				if(valorA + valorB == resultadoSoma) {
				System.out.println(valorA + " somado a "  + valorB + " é igual a: " + resultadoSoma);
			}
		}

	   }
	}
}
