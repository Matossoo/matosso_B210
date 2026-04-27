package crud;

import java.sql.SQLException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		int opcao;
		
		do {
			System.out.println("==MENU CRUD==");
			System.out.println("1 - Inserir pessoa");
			System.out.println("2 - listar");
			System.out.println("3 - atualizar pessoa");
			System.out.println("4 - excluir pessoa");
			System.out.println("0 - Sair");
			System.out.println("\nEscolha opção");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			case 1->{
				try {
					System.out.println("nome: ");
					String nome = sc.nextLine();
					
					System.out.println("idade: ");
					int idade = sc.nextInt();
					
					Pessoa novaPessoa = new Pessoa(nome, idade);
					pessoaDAO.inserir(novaPessoa);
				}catch(SQLException e) {
					System.out.println("Erro ao inserir: "+ e.getMessage());
				}
				
			}
			case 2 ->{
				try {
					List<Pessoa> lista = pessoaDAO.listar();
					
					if(lista.isEmpty()) {
						System.out.println("nenhuma pessoa cadastrada");
					}else {
						System.out.println("Lista de pessoas");
						for(Pessoa listada : lista) {
							System.out.println(listada);
						}
					}
				}catch(SQLException e) {
					System.out.println("Erro ao listar: "+ e.getMessage());
			}
			
			}
			
			
			
		}

	  }while(opcao != 0);
	}
}
