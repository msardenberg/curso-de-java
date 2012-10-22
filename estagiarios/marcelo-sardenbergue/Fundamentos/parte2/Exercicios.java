package Fundamentos.parte2;

import java.util.Scanner;
import java.text.DecimalFormat;

 public class Exercicios {
 
 // 1) Escreva um programa que recebe um valor inteiro e informa se ele é positivo, negativo ou zero.
	
	public static void exercicio1() {  
			
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Digite um valor: ");
		double numero = scanner.nextDouble();
				
		if(numero == 0) {
			System.out.println("O numero digitado foi zero");
		} else if(numero > 0 ) {
			System.out.println("O numero é positivo");
		} else {
			System.out.println("O numero é negativo");
		}
	}

/* 2) A classe String possui o método "length()" que retorna a quantidade de caracteres. 
      Porém, ele leva em conta também os espaços em branco. 
	  Escreva um método que recebe um texto qualquer e retorna a quantidade de caracteres que foi passada descontando esses espaços em branco. 
	  Dica: use o método "toCharArray()" para obter os caracteres da String e percorrê-los, 
	  testando se não são espaços em branco e armazenado em uma variável a quantidade que será retornada ao término da execução do método. */	
	
		public static int exercicio2() {

		int i, contador = 0; 

		System.out.print("Informe o texto: "); 
		String texto = new Scanner(System.in).nextLine();
		
		for(i = 0; i < texto.length(); i++) {
			if(texto.toCharArray()[i] != ' ' ){ 
				contador++;
			}
		}
		return contador;

// 3) Escreva um método que retorne a soma de todos os números de 1 até 9999.
	
	public static double exercicio3() { 
		
		for (double i=1; i<1000; i++) {
			
			double soma += i;
		}
		
		return soma;
	}	

// 4) Escreva um método que retorne a soma de todos os números de 1 até um valor qualquer que ele deverá receber como parâmetro	
	
	public static double exercicio4() {  
	
		double soma = 0;
		System.out.println("Digite o numero maximo para o soma: ");
		double numMaximo = new Scanner(System.in).nextDouble();
			
		for(int i=1; i<= numMaximo; i++) {
			soma += i;
		}
		return soma;
	}	
	

// 5) Escreva um método que retorne a soma de todos os números pares de 1 até um valor qualquer que ele deverá receber como parâmetro.
	
	public static double exercicio5() {  
		
	    double soma = 0;
			
	    	System.out.println("Digite o numero maximo para o soma: ");
			double numMaximo = new Scanner(System.in).nextDouble();
				
			for(int i=1; i<= numMaximo; i++){
				if(i%2 == 0){
					soma += i;
				}
			}
			return soma;
	}

/* 6) Escreva um método que retorne quantos múltiplos de 3 existem entre 1 e 1000. 
      E no momento em que estiver contado também imprima na tela o número que for múltiplo.*/

	public static int exercicio6() {
		
		int contador = 0;
		for(int i = 3; i <= 1000; i+=3){
			contador++;
			System.out.println(i);	
		}
		return contador;
	}
	
/* 7) Escreva um método que recebe o valor do salário base de um funcionário e o valor de sua comissão e retorna o salário somado a comissão. 
      A comissão deverá ser acrescida de um bônus de 20% antes de ser somada ao salário base. 
	  Qual tipo de dado entre os tipos primitivos melhor se encaixaria para lidar com os valores da questão? */
	  
	  /* "Para lidar com dinheiro o melhor tipo seria o "BigDecimal", porém complicado de usar (eu mesmo nao sei). No caso usa-se o "double" com cuidado. 
	  Por ter critérios diferentes quanto se trata de casas decimais perto da importância zero (ex.: 1,2 - 0,3 ... resultado = 0.89999999). 
	  E se tratando de dinheiro qualquer perda seria um erro." */
	
	public static double exercicio7() {
		
		DecimalFormat decimal = new DecimalFormat("0.00");		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario: R$");
		double salario = scanner.nextDouble();		
		System.out.println("Digite o valor da comissão: R$");
		double comissao = scanner.nextDouble();		
		double bonus = comissao * 0.2;
		
		double salarioFinal = salario + comissao + bonus;
		decimal.format(salarioFinal);
		return(salarioFinal);
	}
	
/* 8) Escreva um método que recebe do usuário em um "loop" um valor digitado que corresponderá ao salário 
      e outro valor que corresponderá a comissão. Ele então escreve na tela a soma desses valores 
	  e fica aguardando para receber os próximos dois valores até que os valores digitados sejam ambos zero. 
	  Dica: use a classe Scanner e o método "nextDouble()" para capturar o salário e em seguida a comissão. */
	  
	  
	public static void exercicio8() {
		
		int i = 1;
	
		while(i != 0){ 
			System.out.println("\nPara sair do programa digite zero para salario e tambem para comissao.\n");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o valor do salario: R$");
			double salario = scanner.nextDouble();
			System.out.println("Digite o valor da comissão: R$");
			double comissao = scanner.nextDouble();
				if (salario == 0 && comissao == 0){
					i = 0;
					System.out.println("Programa encerrado!");
					break;
				}
			double salarioFinal = salario + comissao;
	    	System.out.println("R$ " + salarioFinal);
	    }
		
// 9) Escreva um método que recebe o número equivalente ao mês (1 a 12) e escreve o nome do mês.

		
	public static void exercicio9() {
		System.out.println("Informe um valor entre 1 e 12: ");
		int mes = new Scanner(System.in).nextInt();

		if (mes!=1&&mes!=2&&mes!=3&&mes!=4&&mes!=5&&mes!=6&&mes!=7&&mes!=8&&mes!=9&&mes!=10&&mes!=11&&mes!=12) {
			System.out.println("Digite um número valido de 1 a 12:");	
		}else{	
			switch (mes) {

				case 1: System.out.println("Janeiro"); break;
				case 2: System.out.println("Fevereiro"); break;
				case 3: System.out.println("Março"); break;	
				case 4: System.out.println("Abriu"); break;
				case 5: System.out.println("Maio"); break;
				case 6: System.out.println("Junho"); break;
				case 7: System.out.println("Julho"); break;
				case 8: System.out.println("Agosto"); break;
				case 9: System.out.println("Setembro"); break;
				case 10: System.out.println("Outubro"); break;
				case 11: System.out.println("Novembro"); break;
				case 12: System.out.println("Dezembro"); break;
			}
			
		}

	}
	
// 10) Escreva um método que receba um valor representando os segundos e converta este valor para minutos.

	public static void exercicio10() {
		
		DecimalFormat decimal = new DecimalFormat("0.00");
		System.out.println("Informe o tempo em segundos: ");
		double valorSegundos = new Scanner(System.in).nextDouble();
			
			double valorMinutos = valorSegundos / 60;
			
			System.out.println("valor informado em minutos: " + valorMinutos + "min");
	}


// Bloco de execução dos métodos referêntes a seus respectivos exercícios.	
	public static void main(String[] args){
	
		exercicio1();
		
		System.out.println(exercicio2());

		System.out.println(exercicio3());
	
		exercicio4();

		exercicio5();

		System.out.println("\nSão ao total " + exercicio6() + " numeros multiplos de 3.");

		System.out.println("R$ " + exercicio7());
		
		exercicio8();
		
		exercicio9();
		
		exercicio10();
	}


 }