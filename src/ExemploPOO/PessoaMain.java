package ExemploPOO;

import java.util.*;

public class PessoaMain {

	public static void main(String[] args) {
		
		/*
		Pessoa p1 = new Pessoa("Natalino", 39, "123.456.789-90");

		System.out.println(p1.getNome()+"\n"+ p1.getIdade()+"\n"+ p1.getCpf());
		
		p1.setIdade(99);
		System.out.println(p1.getIdade());
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("digite sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("digite seu cpf: ");
		String cpf = sc.nextLine();
		
		Pessoa p1 = new Pessoa(nome, idade, cpf);
		
		System.out.println(p1.getNome());
		
		sc.close();
	}


}
