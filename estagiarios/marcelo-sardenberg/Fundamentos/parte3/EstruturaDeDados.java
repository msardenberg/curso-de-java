package Fundamentos.parte3;
import java.util.Scanner;

public class EstruturaDeDados {

	public static void ex1() {
		
		int[][] matriz = new int[2][4];
	}
	
	public static void ex2() {    // declarei e criei.
	
		int[] vetor = new int[10];
	
		int dado[];
		dado = new int[15];
	}
	

	public static void ex3() {  // Fiz um pouco diferente do que você pediu, mas achei bom para exercitar.
				
		int linha = 2, coluna = 4;
		int m[][] = new int[linha][coluna]; // Não sei se seria boa prática fazer isso.
		
		Scanner valorLinhaColuna = new Scanner(System.in);
		
		for (linha = 0; linha <2; linha++) {
			System.out.printf("Informe os elementos da linha %d:\n", (linha +1));
			for (coluna = 0; coluna <4; coluna++) { 
				System.out.printf("m[%d][%d] = ", linha, coluna);
				m[linha][coluna] = valorLinhaColuna.nextInt();  // m[linha][coluna] = linha + coluna --> seria para resolução do exercício 3 original.
			}
			System.out.println("");
		}
		for (linha=0; linha<2; linha++) {
			System.out.printf("%da. linha: ", (linha +1));
			for (coluna=0; coluna<4; coluna++) {
				System.out.printf("%d ", m[linha][coluna]);
			}
			System.out.println("");
	}	

	
	public static void ex4() {
	
		System.out.println(" a) 0 e 0L respectivamente");
		System.out.println(" b) 0.0f e 0.0d respectivamente");
		System.out.println(" c) false");
		System.out.println(" d) null");
	}
	
	public static void ex5() {
	
		int[] vetor = {1,2,3,4,5};
	}
	

	public static void ex9 () {
		System.out.print(" Resposta: a), b), c) e f) estão erradas.");
	}


	public static void ex10 {
		public static void ex10() {
		int i, soma = 0;
		for(i = 0; i<4; i++){
		System.out.printf("informe o número %d.o numero: ", (i+1));
			Scanner scanner = new Scanner(System.in);
			String numero = scanner.nextLine();

			soma += Integer.parseInt(numero);
		}
		System.out.println(soma);
	}

	


	public static void main(String[] args) {
		
		ex3();
		
		Pessoa p = new Pessoa ("Marcelo", "Sardenberg"); // Exercicio 6
		System.out.println(p.nomeESobrenome());
		
		ex10();
	}
}