
// exercicio 6 de Estrutura de dados
public class Pessoa {
	
	public Pessoa(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	private String nome;
	private String sobrenome;
	
	public String nomeESobrenome(){
		return this.nome + " " + this.sobrenome;
	}
	
}