package fundamentos.parte1;

import java.util.*;

public class Exercicio4{
	
	
	public static void main(String[] a){
		
		final double PI = 3.14;

		System.out.println("Enter with the Raio:");

		Scanner r = new Scanner(System.in);

		Double raio = r.nextDouble();

//Ou  raio = new Scanner(System.in).nextDouble();
		
		System.out.println("\nPerimetro: " + 2*PI*raio);
	}


}
