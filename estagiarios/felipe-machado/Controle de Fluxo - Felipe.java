import java.util.Scanner;


public class ExerciciosControleFluxo{
	private static Scanner s;
	
	
	//--- Exercicio 1 ---
	public String positivoOuNegativo (int numero){
		if (numero > 0){
			return "Positivo";
		}		
		else if (numero < 0){
			return "Negativo";
		}
		else 
			return "Zero";	
	}
	
	//--- Exercicio 2 ---
		public int contaCaracteresFrase (String frase){
			int contadorBlank = 0;
			for (char caractere : frase.toCharArray()){
				if (caractere == ' '){
					contadorBlank++;
				}	
			}	
			return (frase.length() - contadorBlank);		
		}
		
	
	//--- Exercicios 3 e 4---
	public long somaDe1AteParametro (int numero){
		long total = 0;
		for (int contador = 1; contador <= numero; contador++){
			total = total + contador; 
		}		
		return total;
	}

	//--- Exercicio 5 ---
		public int somaNumerosPares (int numero){
			int soma = 0;
			for (int i = 0; i < numero; i++){	
				if (verificaSeDivisivel(i,2))
					soma = soma + i;
			}
			return soma;
		}
	
	//--- Fiz esse método só pra testar chamada de método dentro de método
	public boolean verificaSeDivisivel (int numero, int divisor){
		return (numero%divisor) == 0;
	}	
	
	//--- Exercicio 6 --- Alem de contar quantos números são divisíveis no intervalo ele também imprime os respectivos números
	public void contaNumerosDivisiveis (int numero, int divisor){
		int contador = 0;
		for (int i = 1; i < numero; i++){
			if (verificaSeDivisivel(i,divisor)){
				System.out.println(i);
				contador++;
			}
		}
		System.out.println("Existem " +contador+ " números divisíveis por " +divisor+ " no intervalo entre 1 e "+numero);
	}
	
	
	//--- Exercício 7 ---
	public double comissaoAoFuncionario (double salario, double comissao){
		comissao = comissao + comissao * 0.2;
		return (salario+ comissao);
	}
	
	//---Exercício 8 ---
	public void salarioComissaoLoop (){
		double salario = 0;
		double comissao = 0;
		do {
			System.out.println("Digite o salário do funcionário:");
			Scanner sal = new Scanner (System.in);
			salario = sal.nextDouble();
			System.out.println("Entre com o valor da comissao");
			Scanner com = new Scanner (System.in);
			comissao = com.nextDouble();
			System.out.println ("O salário acrescido da comissao é: "+ (salario+comissao));
		} while ((salario + comissao) != 0);
	}
	
    //--- Exercício 9 ---	
	public String mesesDoAno (int numero){
		String mes = new String();
		if (numero > 0 && numero <13){
		
			switch(numero){
				case 1:	
					mes = "Janeiro";
					break;
				case 2:
					mes = "Fevereiro";
					break;
				case 3:
					mes = "Março";
					break;
				case 4:
					mes = "Abril";
					break;
				case 5:
					mes = "Maio";
					break;
				case 6:
					mes = "Junho";
					break;
				case 7:
					mes = "Julho";
					break;
				case 8:
					mes = "Agosto";
					break;
				case 9:
					mes = "Setembro";
					break;
				case 10:
					mes = "Outubro";
					break;
				case 11:
					mes = "Novembro"; 
					break;
				case 12: 
					mes = "Dezembro";
					break;
			}	
		}
		else{
			mes  = "Mês inexistente";
		}
		return mes;
	}
	
	
	//--- Exercício 10 ---
	public double converteSegundosParaMinutos (double segundos){
		return segundos/60;			
	}
	
	
	
	//--- PROGRAMA PRINCIPAL ---
	public static void main (String[] args){

		ExerciciosControleFluxo controle = new ExerciciosControleFluxo();
		s = new Scanner(System.in);

		boolean continua = true;
		while (continua){
			
			System.out.println("==============================================================");
			System.out.println("O que você deseja fazer?");
			System.out.println("1. Verificar se o número digitado é positivo, negativo ou zero");
			System.out.println("2. Retorna quantos caracteres existem na frase sem contar os espaços em branco");
			System.out.println("3. Retorna a soma de 1 até 9999");
			System.out.println("4. Retorna a soma de 1 até número digitado");
			System.out.println("5. Retorna a soma de todos os números pares entre 1 e o número digitado");
			System.out.println("6. Retorna quantos múltiplos de 3 existem entre 1 e 1000 e imprime na tela o número que for múltiplo.");
			System.out.println("7. Recebe o valor do salário base de um funcionário e o valor de sua comissão e retorna o salário somado a comissão. A comissão é acrescida de um bônus de 20% antes de ser somada ao salário base."); 
			System.out.println("8. Loop para somar salário mais comissão");
			System.out.println("9. Imprime o mẽ");
			System.out.println("10.Converte de segundos para minutos");
			System.out.println("0. Sair");
			
			int opcao = s.nextInt();
			switch (opcao){
				case 1:
					System.out.println("Entre com um número para saber se ele é positivo, negativo ou zero:");
					int numero = s.nextInt();
					System.out.println ("O número digitado é "+ controle.positivoOuNegativo(numero));
					break;

				case 2: 
					System.out.println("Entre com uma frase qualquer");
					s = new Scanner(System.in);
					String frase = s.nextLine();
					System.out.println("Existem " +controle.contaCaracteresFrase(frase)+ " caracteres na frase");
					break;

				case 3:
					System.out.println("A soma de todos os números entre 1 e 9999 é: " + controle.somaDe1AteParametro(9999));
					break;

				case 4:
					System.out.println ("Entre com um número: ");
					s = new Scanner (System.in);
					int numero2 = s.nextInt();
					System.out.println("A soma de todos os números entre 1 e " +numero2+ " é: " + controle.somaDe1AteParametro(numero2));
					break;

				case 5:
					System.out.println ("Entre com um número: ");
					s = new Scanner (System.in);
					int numero3 = s.nextInt();
					System.out.println("A soma de todos os números pares entre 1 e " +numero3+ " é: " + controle.somaNumerosPares(numero3));
					break;

				case 6:
					System.out.println("Veja a lista dos números divisíveis por três no intervalo entre 1 e 1000");
					controle.contaNumerosDivisiveis(1000,3); 								
					break;

				case 7:
					System.out.println ("Entre com o valor do salário base do funcionário: ");
					s = new Scanner(System.in);
					double salario = s.nextDouble();
					System.out.println ("Entre com a comissao do funcionário: ");
					s = new Scanner(System.in);
					double comissao = s.nextDouble();
					System.out.println("O valor do salário acrescido da comissão é: "+ controle.comissaoAoFuncionario(salario,comissao));
					break;
				
				case 8: 
					controle.salarioComissaoLoop();
					break;

				case 9:
					System.out.println("Entre com o número correspondente ao mês desejado.");
					s = new Scanner(System.in);
					numero = s.nextInt();
					System.out.println("Número " +numero+ " = " +controle.mesesDoAno(numero));
					break;

				case 10:
					System.out.println("Entre com o valor em segundos:");
					s = new Scanner(System.in);
					double segundos = s.nextLong();
					System.out.println(segundos+ " segundo(s) corresponde(m) a " +controle.converteSegundosParaMinutos(segundos)+ " minutos");
					break;	
				
				case 0:
					continua = false;
			}
		}
		
	}
}
