package Fundamentos.parte4.ex3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*3 - Implemente um programa que receber� do usu�rio duas rela��es de n�meros inteiros positivos 
 * e um caractere representando uma das seguintes opera��es:  + (uni�o) ... * (interse��o).
 */

/**
 * Executa a opera��o Uni�o ou Interse��o entre dois conjuntos.
 * @author Marcelo Sardenberg
 *
 */
public class UniaoIntersecao {


	public Set<Integer> conjuntoA = new TreeSet<Integer>();
	public Set<Integer> conjuntoB = new TreeSet<Integer>();

	public void uniao(){
		conjuntoA.addAll(conjuntoB);
		System.out.println("Uni�o: " + conjuntoA);
	}
	public void intersecao(){
		conjuntoA.retainAll(conjuntoB);
		System.out.println("Interse��o: " + conjuntoA);
	}
	public void mostraConjunto(){
		System.out.println("A: " + conjuntoA);
		System.out.println("B: " + conjuntoB);
	}


	public static void main(String[] args) {

		UniaoIntersecao ui = new UniaoIntersecao();
		Scanner scanner = new Scanner(System.in);
		int i = 1;

		conjuntoAWhile: while(true){

			System.out.printf("Digite o %d� n�mero da CONJUNTO A ou 'S' para preencher a CONJUNTO B : ", i); 
			String opcaoA = scanner.nextLine();
			if (opcaoA.toUpperCase().equals("S")){
				System.out.println("");
				break conjuntoAWhile;
			}else{
				try{
					Integer opcaoAInt = Integer.parseInt(opcaoA);
					if(opcaoAInt <= 0){
						System.out.println("* S� permitido n�meros positivos...Tente novamente *");
						continue conjuntoAWhile;
					}
					ui.conjuntoA.add(opcaoAInt);
				}catch (Exception e) {
					System.out.println("* S� permitido n�meros inteiros e positivos... Tente novamente *");
					continue conjuntoAWhile;
				}
				i++;
			}
		}
		
		i=1;
		conjuntoBWhile: while(true){

			System.out.printf("Digite o %d� n�mero da CONJUNTO B ou 'S' para finaliz�-la: ", i); 
			String opcaoB = scanner.nextLine();
			if (opcaoB.toUpperCase().equals("S")){
				System.out.println("\nOs CONJUNTOS s�o: ");
				break conjuntoBWhile;
			}else{
				try{
					Integer opcaoBInt = Integer.parseInt(opcaoB); 
					if(opcaoBInt <= 0){
						System.out.println("* S� permitido n�meros positivos...Tente novamente *");
						continue conjuntoBWhile;
					}
					ui.conjuntoB.add(opcaoBInt);
				}catch (Exception e) {
					System.out.println("* S� permitido n�meros inteiros e positivos... Tente novamente *");
					continue conjuntoBWhile;
				}
				i++;
			}
		}

		ui.mostraConjunto();

		sinalWhile: while(true){
			System.out.print("\nAgora escolha o sinal de '+' (UNI�O) ou * (INTERSE��O) para definir a opera��o: ");
			String sinal = scanner.nextLine();
			if(sinal.equals("+")){
				ui.mostraConjunto();
				ui.uniao();
				break sinalWhile;
			}else if(sinal.equals("*")){
				ui.mostraConjunto();
				ui.intersecao();
				break sinalWhile;
			}else{
				System.out.println("* Op��o inv�lida...Tente novamente *");
				continue sinalWhile;
			}

		}
	}
}
