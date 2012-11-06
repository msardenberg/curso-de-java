package Fundamentos.parte4.ex4

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* 4 - Implemente um programa para medir o tempo de execução de algumas classes da API de collections (pelo menos 4 delas) 
 * no que diz respeito a adicionar e percorrer elementos. Receba do usuário a quantidade de elementos que serão inseridos. 
 * Dica: Use System.currentTimeMillis() para pegar o tempo atual em milissegundos.
 */

public class MedirTempoCollections {

	public static List<Double> arrayLista = new ArrayList<Double>();
	public static List<Double> linkedLista = new LinkedList<Double>();
	public static Set<Double> conjunto = new TreeSet<Double>();
	public static Map<Double,Double> mapa = new HashMap<Double,Double>();


	public static void estruturaArrayLista(){
		System.out.print("Informe quantos números devem ser inseridos no ARRAY LISTA: ");
		Double quantidade = new Scanner(System.in).nextDouble();
		double inicio = System.currentTimeMillis();
		for (double i = 0; i <quantidade ; i++) {
			arrayLista.add(i);
		}
		for (Double pecorreALista : arrayLista) {
			double recebe1 = pecorreALista;
		}
		double fim = System.currentTimeMillis();
		System.out.println("Tempo Array Lista: " + (fim - inicio));
	}

	public static void estruturaLinkedLista(){
		System.out.print("Informe quantos números devem ser inseridos no LINKED LISTA: ");
		Double quantidade = new Scanner(System.in).nextDouble();
		double inicio = System.currentTimeMillis();
		for (double i = 0; i <quantidade ; i++) {
			linkedLista.add(i);
		}
		for (Double pecorreLLista : linkedLista) {
			double recebe2 = pecorreLLista;
		}
		double fim = System.currentTimeMillis();
		System.out.println("Tempo Linked Lista: " + (fim - inicio));
	}

	public static void estruturaConjunto(){
		System.out.print("Informe quantos números devem ser inseridos no CONJUNTO: ");
		Double quantidade = new Scanner(System.in).nextDouble();
		double inicio = System.currentTimeMillis();
		for (double i = 0; i <quantidade ; i++) {
			conjunto.add(i);
		}
		for (Double pecorreConjunto : conjunto) {
			double recebe3 = pecorreConjunto;
		}
		double fim = System.currentTimeMillis();
		System.out.println("Tempo Conjunto: " + (fim - inicio));
	}

	public static void estruturaMapa(){
		System.out.print("Informe quantos números devem ser inseridos no MAPA: ");
		Double quantidade = new Scanner(System.in).nextDouble();
		Double chave = 1.0; 
		double inicio = System.currentTimeMillis();

		for (double i = 0; i <quantidade ; i++) {
			mapa.put(chave, i);
			chave++;
		}
		for (double pecorreMapa : mapa.keySet()) {
			double recebe4 = pecorreMapa;
		}
		double fim = System.currentTimeMillis();
		System.out.println("Tempo: " + (fim - inicio));
	}

	public static void main(String[] args) {

		estruturaArrayLista();
		estruturaLinkedLista();
		estruturaConjunto();
		estruturaMapa();
	}
}