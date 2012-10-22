package fundamentos.parte1;

import java.util.Scanner;

public class Exercicio5{
	public static void main(String[] a){
		System.out.println("Enter with the catet1");
		Scanner c1 = new Scanner(System.in);
		Double catet1 = c1.nextDouble();

		System.out.println("Enter with the catet2");
		Scanner c2 = new Scanner(System.in);
		Double catet2 = c2.nextDouble();
		
		System.out.println("Hipotenusa: " + Math.sqrt( Math.pow(catet1,2) + Math.pow(catet2,2) ) );


	}



}
