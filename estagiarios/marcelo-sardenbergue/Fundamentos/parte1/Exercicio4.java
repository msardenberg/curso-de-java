
package fundamentos.parte1;

import java.util.Scanner;


public class Exercicio4 {

  public static void main(String[] args){

    final Double pi = 3.14;

	System.out.println("Digite o valor do raio da circunferencia: ");
	Scanner scanner = new Scanner(System.in);	
	String raio = scanner.next();
	
	Double raioDouble = Double.parseDouble(raio);

	
	Double comprimento = 2 * pi * raioDouble;
	System.out.println("O comprimento da circunferencia seria: " + comprimento);
		
  }

}