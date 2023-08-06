package questao12;

public class ImprimirDivisao {

	public static void main(String[] args) {
		
		System.out.println("--- Double ---");
		
		double iDivididoDouble;
		
		for(double i = 0; i <= 100; i++) {
			if(i % 3 == 0) {
				iDivididoDouble = i/2;
				System.out.println(iDivididoDouble);
			}
		
	
		}
	System.out.println("--- Int ---");
	
		int iDivididoInt;
		
		for(int i = 0; i <= 100; i++) {
			if(i % 3 == 0) {
				iDivididoInt = i/2;
				System.out.println(iDivididoInt);
			}
		}		
}
	
}