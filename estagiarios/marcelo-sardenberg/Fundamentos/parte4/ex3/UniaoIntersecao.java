package Fundamentos.parte4.ex3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*3 - Implemente um programa que receberá do usuário duas relações de números inteiros positivos 
 * e um caractere representando uma das seguintes operações:  + (união) ... * (interseção).
 */

/**
 * Executa a operação União ou Interseção entre dois conjuntos.
 * @author Marcelo Sardenberg
 *
 */
public class UniaoIntersecao {


	public Set<Integer> conjuntoA = new TreeSet<Integer>();
	public Set<Integer> conjuntoB = new TreeSet<Integer>();

	public void uniao(){
		conjuntoA.addAll(conjuntoB);
		System.out.println("União: " + conjuntoA);
	}
	public void intersecao(){
		conjuntoA.retainAll(conjuntoB);
		System.out.println("Interseção: " + conjuntoA);
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

			System.out.printf("Digite o %dº número da CONJUNTO A ou 'S' para preencher a CONJUNTO B : ", i); 
			String opcaoA = scanner.nextLine();
			if (opcaoA.toUpperCase().equals("S")){
				System.out.println("");
				break conjuntoAWhile;
			}else{
				try{
					Integer opcaoAInt = Integer.parseInt(opcaoA);
					if(opcaoAInt <= 0){
						System.out.println("* Só permitido números positivos...Tente novamente *");
						continue conjuntoAWhile;
					}
					ui.conjuntoA.add(opcaoAInt);
				}catch (Exception e) {
					System.out.println("* Só permitido números inteiros e positivos... Tente novamente *");
					continue conjuntoAWhile;
				}
				i++;
			}
		}
		
		i=1;
		conjuntoBWhile: while(true){

			System.out.printf("Digite o %dº número da CONJUNTO B ou 'S' para finalizá-la: ", i); 
			String opcaoB = scanner.nextLine();
			if (opcaoB.toUpperCase().equals("S")){
				System.out.println("\nOs CONJUNTOS são: ");
				break conjuntoBWhile;
			}else{
				try{
					Integer opcaoBInt = Integer.parseInt(opcaoB); 
					if(opcaoBInt <= 0){
						System.out.println("* Só permitido números positivos...Tente novamente *");
						continue conjuntoBWhile;
					}
					ui.conjuntoB.add(opcaoBInt);
				}catch (Exception e) {
					System.out.println("* Só permitido números inteiros e positivos... Tente novamente *");
					continue conjuntoBWhile;
				}
				i++;
			}
		}

		ui.mostraConjunto();

		sinalWhile: while(true){
			System.out.print("\nAgora escolha o sinal de '+' (UNIÂO) ou * (INTERSEÇÂO) para definir a operação: ");
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
				System.out.println("* Opção inválida...Tente novamente *");
				continue sinalWhile;
			}

		}
	}
}
