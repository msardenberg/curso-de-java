package fundamentos.parte2;

import java.util.Scanner;



public class AulaControleDeFluxo{
	public static void main(String[] a){
		AulaControleDeFluxo aula = new AulaControleDeFluxo();
		/*System.out.print("Digite um numero: ");
		int n = new Scanner(System.in).nextInt();
		aula.exercicio1(n);*/

		System.out.println("Contador 1: " + aula.exercicio2("Programa de Estagio 2012"));	


		//System.out.println(aula.exercicio3());

		/*System.out.print("Digite um numero: ");
		int n = new Scanner(System.in).nextInt();
	        System.out.println(aula.exercicio4(n));*/


		/*System.out.print("Digite um numero: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println(aula.exercicio5(n));*/


		//System.out.println("Quantidade de multiplos de 3 eh: " +aula.exercicio6());
		

		/*System.out.println("Digite seu salario: ");
		double n = new Scanner(System.in).nextDouble();
		System.out.println("Digite a comissao: ");
		double n2 = new Scanner(System.in).nextDouble();
		System.out.println(aula.exercicio7(n,n2));*/
		
		//aula.exercicio8();
		
		//aula.exercicio9(9);

		aula.exercicio10(600);

		}

	public void exercicio1(int valor ){
		if(valor > 0){
			System.out.println("O numero " + valor + " eh positivo");	
		}
		else if(valor < 0){
			System.out.println("O numero " + valor + " eh negativo");	
		}
		else{
			System.out.println("O numero eh zero");
		}	

	}

	public int exercicio2(String texto){
		char[] a = texto.toCharArray();
		int contador = 0, contador2 = 0;
		System.out.println("Tamanho do texto" + texto.length());

		for(int i = 0; i<texto.length(); i++){
			//solucao 1
			if(a[i] != ' '){
				contador++;
			}
			//solucao 2
			if(texto.charAt(i) != ' '){
				contador2++;
				
			}		
		}
		System.out.println("Contador 2: " + contador2);
		return contador;
	}

	
	public int exercicio3(){
		int soma = 0;
		for(int i=1; i<10000 ; i++){
			soma += i;
		}	
		return soma;

	}
	public int exercicio4(int valor){
		int soma = 0;
		for(int i=1; i<valor+1 ; i++){
			soma += i;
		}	
		return soma;

	}

	public int exercicio5(int valor){
		int soma = 0;
		for(int i=1; i<valor+1 ; i++){
		    if(i% 2 ==0){
			soma += i;
		    }
		}	
		return soma;

	}

	public int exercicio6(){
		int contador3 = 0;
		System.out.println("Esse sao os multiplos de 3: ");
		for(int i=1; i<1001 ; i++){
		    if(i % 3 ==0){
			contador3 ++;
                        System.out.print(" "+ i +",");
		    }
		}
		System.out.print(". \n");	
		return contador3;

	}

	public double exercicio7(double salarioBase, double comissao){
		return salarioBase + (comissao*1.2);	
	}


	public void exercicio8(){
		double salarioBase, comissao, salario;
		do{
		System.out.println("Digite o salario: ");
		salarioBase = new Scanner(System.in).nextDouble();
		System.out.println("Digite a comissao: ");
		comissao = new Scanner(System.in).nextDouble();
		System.out.println("Salario = " + (salarioBase + comissao));
		
		}while(!(salarioBase==0 && comissao==0));
	
	}
	 
       public void exercicio9(int mes){
		switch(mes){
			case 1 :
			System.out.println("Mês eh Janeiro");
			break;
			case 2 :
			System.out.println("Mês eh Fevereiro");
			break;
			case 3 :
			System.out.println("Mês eh Março");
			break;
			case 4 :
			System.out.println("Mês eh Abril");
			break;
			case 5 :
			System.out.println("Mês eh Maio");
			break;
			case 6 :
			System.out.println("Mês eh Junho");
			break;
			case 7 :
			System.out.println("Mês eh Julho");
			break;
			case 8 :
			System.out.println("Mês eh Agosto");
			break;
			case 9 :
			System.out.println("Mês eh Setembro");
			break;
			case 10:
			System.out.println("Mês eh Outubro");
			break;
			case 11 :
			System.out.println("Mês eh Novembro");
			break;
			case 12 :
			System.out.println("Mês eh Dezembro");
			break;
			default:
			System.out.println("Opçao invalida! Digite de 1 a 12");
		}
}

	  public void exercicio10(double segundos){
		double minutos;				
		minutos = segundos/60;
		System.out.println("Minutos: " + minutos);
	}				

}
