package questao7;

public class DivisaoDeMultiplos {
	
	public static void main(String[] args) {
		System.out.println("----Int----");
	        for (int i = 1; i <= 100; i++) {
	            if (i % 3 == 0) {
	                int resultadoInt = i / 2;
	                System.out.println(i + " dividido por 2 é igual " + resultadoInt);
	                
	        }
	        
	       
	  }   
	    System.out.println("----Double----");
           for (double x = 1; x <= 100; x++) {
                if (x % 3 == 0) {
                    double resultadoDouble = x / 2;
                    System.out.println(x + " dividido por 2 é igual " + resultadoDouble);
                }     
           }
	}
}