package exer_heranca;

import java.util.*;

public class SistemaEscola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> pessoa = new ArrayList<>();
		int opcao;
		
		
		do {
			
			System.out.println("1. Cadastrar aluno");
			System.out.println("2. Cadastrar professor");
			System.out.println("3. Listar todos");
			System.out.println("0. Sair");
			System.out.print("Escoolha: ");
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			case 1 ->{
				
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("CPF: ");
				String cpf = sc.nextLine();
				
				System.out.print("Idade: ");
				int idade = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Matricula: ");
				int matricula = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Curso: ");
				String curso = sc.nextLine();
				
				Pessoa a = new Aluno(nome, cpf, idade, matricula, curso);
				pessoa.add(a);
				
			}
			case 2 ->{
			
				System.out.print("\nNome: ");
				String nome = sc.nextLine();
				
				System.out.print("CPF: ");
				String cpf = sc.nextLine();
				
				System.out.print("Idade: ");
				int idade = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Disciplina: ");
				String disciplina = sc.nextLine();
				
				System.out.println("Salário: ");
				double salario = sc.nextDouble();
				
				Pessoa b = new Professor(nome, cpf, idade, disciplina, salario);
				pessoa.add(b);
				
			}
			case 3 ->{
				if(pessoa.isEmpty()) {
					System.out.println("Lista vazia!");
				}else {
					for(Pessoa p : pessoa) {
						p.exibirDados();
					}
				}
				
				
			}
			case 4 ->{
				System.out.println("Saindo...");
			}
			default ->{
				System.out.println("Opçao invalida!");
			}
			}
			
		}while(opcao != 0);
		
		sc.close();
	}

}
