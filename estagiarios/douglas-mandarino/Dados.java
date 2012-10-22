import java.util.Scanner;
import java.lang.Math;

public class Dados{
	public static void main(String[] args){
		int[] array = {0,0,0,0,0,0};
		int[] contador = {0,0,0,0,0,0};

		System.out.println("Quantas vezes jogará o dado?");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0; i<n; i++){
			int num = (int) (1+Math.random() * 5); 			
			System.out.println("Qual o valor?");
			Scanner scandado = new Scanner(System.in);
			int resultado = scandado.nextInt();
			contador[num] += 1;
			array[num] +=resultado;
			
			

		}
		for(int i=0; i<6; i++){
			System.out.println("Indice " + i + " foi acessado:" + contador[i] );
		}

	
	}
}
