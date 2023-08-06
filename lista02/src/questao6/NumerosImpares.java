package questao6;

public class NumerosImpares {

	public static void main(String[] args) {
		float produtoFloat = 1;
		int produtoInt = 1;
		
		for(int i = 15; i <= 30; i++) {
			if(i % 2 !=0) {
				produtoFloat = produtoFloat * i;
				produtoInt = produtoInt * i;
				
			}
			
		}
		System.out.println(produtoFloat);
		System.out.println(produtoInt);
	}
	
}
