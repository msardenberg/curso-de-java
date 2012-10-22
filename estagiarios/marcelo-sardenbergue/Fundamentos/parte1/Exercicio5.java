import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio5 {

   public static void main(String[] args){


	DecimalFormat decimal = new DecimalFormat("0.000");
		
	Scanner scanner = new Scanner(System.in);	
	
	System.out.println("informe o cateto 1 do triangulo retangulo: ");
	String cateto1 = scanner.next();
	Double cateto1Double = Double.parseDouble(cateto1);
	
	System.out.println("informe o cateto 2 do triangulo retangulo: ");
	String cateto2 = scanner.next();
	Double cateto2Double = Double.parseDouble(cateto2);
	
	Double hipotenusa = Math.sqrt(Math.pow(cateto1Double,2) + Math.pow(cateto2Double,2));
	
	System.out.println("Resultado: " + decimal.format(hipotenusa));
	


  }

}