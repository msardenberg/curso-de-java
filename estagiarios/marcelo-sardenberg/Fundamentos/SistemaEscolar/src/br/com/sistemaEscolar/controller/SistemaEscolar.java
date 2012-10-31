package br.com.sistemaEscolar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.sistemaEscolar.model.Aluno;
import br.com.sistemaEscolar.model.PessoaEscolar;
import br.com.sistemaEscolar.model.Professor;


/**
 * Sistema da escola.
 * @author Marcelo Sardenberg
 *
 */

public class SistemaEscolar {

	private static List<PessoaEscolar> pessoasCadastradas = new ArrayList<PessoaEscolar>();

	public static void cadastrar(PessoaEscolar usuario){
		
	//	PessoaEscolar pessoaEscolarEncontrada = pesquisarPessoa(usuario.getCpf());
		if(pessoasCadastradas.contains(usuario)){
			System.out.println("\nCadastro não realizado. Existe uma pessoa com este CPF.");
			imprimePessoa(usuario);
		}else{
			SistemaEscolar.pessoasCadastradas.add(usuario);
			System.out.println("\n*Cadastro efetuado*");
		}
		
	}

	public static void main(String[] args) {

		menuPrincipalWhile: while(true){

			Scanner scanner = new Scanner(System.in);
			System.out.println("\n------ Menu Principal ------");
			System.out.println("0: Sair do programa");
			System.out.println("1: Pesquisar pessoas");
			System.out.println("2: cadastrar Professor");
			System.out.println("3: cadastrar Aluno");

			String opcao = scanner.nextLine();
			int opcaoInt;

			try{
				opcaoInt = Integer.parseInt(opcao);
			}catch (Exception e) {
				System.out.println("Opção inválida, tente novamente.");
				continue menuPrincipalWhile;
			} 
			
			switch(opcaoInt){
			case 0:
				System.out.println("Fechando programa...");
				break menuPrincipalWhile;
			case 1: 
				menuPesquisa();
				continue menuPrincipalWhile;

			case 2:
				menuCadastro(new Professor());
				continue menuPrincipalWhile;
			case 3:
				menuCadastro(new Aluno());
				continue menuPrincipalWhile;
			default:
				System.out.println("Opção inválida");
				continue menuPrincipalWhile;
			}
		}
	}
	private static void menuPesquisa() {
		System.out.println("------ Pesquisar pessoa ------");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o CPF: ");
		String cpf = scanner.nextLine();

		PessoaEscolar pessoaEscolar = pesquisarPessoa(cpf);

		if(pessoaEscolar != null){
			imprimePessoa(pessoaEscolar);
		}else{
			System.out.println("*Pessoa não tem cadastro*");
		}
	}

	private static PessoaEscolar pesquisarPessoa(String cpf){
		for(PessoaEscolar pessoaEscolar : pessoasCadastradas) {
			if(pessoaEscolar.getCpf().equals(cpf)){
				return pessoaEscolar;
			}
		}
		return null;
	}

	private static void imprimePessoa(PessoaEscolar pessoaEscolar){
		if(pessoaEscolar == null){
			return;
		}

		System.out.println("* Dados da pessoa *");
		String tipoPessoa = getTipoPessoa(pessoaEscolar);
		System.out.println("Tipo: " + tipoPessoa);
		System.out.println("Nome: " + pessoaEscolar.getNome());
		System.out.println("CPF: " + pessoaEscolar.getCpf());
		System.out.println("Tel.: " + pessoaEscolar.getTelefone());
	}

	private static String getTipoPessoa(PessoaEscolar pessoaEscolar) {
		String tipoPessoa;
		if(pessoaEscolar instanceof Professor){
			tipoPessoa = "Professor";
		}else if(pessoaEscolar instanceof Aluno){
			tipoPessoa = "Aluno";
		}else{
			tipoPessoa = "Desconhecido";
		}
		return tipoPessoa;
	}

	private static void menuCadastro(PessoaEscolar pessoaEscolar) {

		System.out.println("------ Cadastro de " + getTipoPessoa(pessoaEscolar) + " ------");

		cadastroWhile: while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.print("Digite o nome do " + getTipoPessoa(pessoaEscolar) + " ou 0 para cancelar cadastro: ");
			String nome = scanner.nextLine();
			if("0".equals(nome)){
				break cadastroWhile;
			}
			pessoaEscolar.setNome(nome);
			System.out.print("Digite o cpf ou 0 (zero) para cancelar cadastro: ");
			String cpf = scanner.nextLine();
			if(nome.equals("0")){
				break cadastroWhile;
			}
			pessoaEscolar.setCpf(cpf);

			System.out.print("Digite um telefone: ");
			String telefone = scanner.nextLine();
			pessoaEscolar.setTelefone(telefone);

			SistemaEscolar.cadastrar(pessoaEscolar);

			return;
		}
	}
}




