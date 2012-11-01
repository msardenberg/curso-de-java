package Fundamentos.parte4.ex2;

import java.util.HashMap;
import java.util.Map;

/**
 * Tarefas do dia.
 * @author Marcelo Sardenberg
 *
 */
public class TesteLembrete {

	/*2 - Crie uma classe Lembrete com um atributo List<String> tarefas. Em um método main, 
	 * crie um mapa cujas chaves serão os dias da semana (String) e os valores serão objetos da classe Lembrete. 
	 * Escreva algum código demonstrando a estrutura criada.
	 */

	private	String seg = "Segunda-feira";
	private String ter = "Terça-feira";
	private	String qua = "Quarta-feira";
	private	String qui = "Quinta-feira";
	private String sex = "Sexta-feira";
	private String sab= "Sábado";
	private	String dom = "Domingo";

	public String getSeg() {
		return seg;
	}
	public String getTer() {
		return ter;
	}
	public String getQua() {
		return qua;
	}
	public String getQui() {
		return qui;
	}
	public String getSex() {
		return sex;
	}
	public String getSab() {
		return sab;
	}
	public String getDom() {
		return dom;
	}


	public static void main(String[] args) {
		Map<String, Lembrete> mapa = new HashMap<String, Lembrete>();
		TesteLembrete tl = new TesteLembrete();

		Lembrete lem1 = new Lembrete();
		lem1.tarefas.add("ir ao médico");
		lem1.tarefas.add("ir a explicadora");

		Lembrete lem2 = new Lembrete();
		lem2.tarefas.add("academia");
		lem2.tarefas.add("ir ao mercado");

		Lembrete lem3 = new Lembrete();
		lem3.tarefas.add("programar java");

		Lembrete lem4 = new Lembrete();
		lem4.tarefas.add("Jiu-Jtsu");

		Lembrete lem5 = new Lembrete();
		lem5.tarefas.add("faculdade");

		Lembrete lem6 = new Lembrete();
		lem5.tarefas.add("Academia");

		Lembrete lem7 = new Lembrete();
		lem5.tarefas.add("Surfar pela manhã");
		lem5.tarefas.add("Cinema a noite");

		mapa.put(tl.getSeg(), lem1);
		mapa.put(tl.getTer(), lem2);
		mapa.put(tl.getQua(), lem3);
		mapa.put(tl.getQui(), lem4);
		mapa.put(tl.getSex(), lem5);
		mapa.put(tl.getSab(), lem6);
		mapa.put(tl.getDom(), lem7);

		System.out.println(tl.seg + ":\n" + lem1.tarefas);
		System.out.println("----- ou -----");
		for (String tarefaSegunda: lem1.tarefas) {
			System.out.println(tl.getSeg() + ": " + tarefaSegunda);
		}
	}
}
