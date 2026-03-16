package POO_arraylist;

import java.util.*;

public class SistemaAlunosMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Aluno> alunos = new ArrayList<>();
		int opcao;
		
		
		do {
			
			System.out.print(
					 "=== CADASTRO DE ALUNOS ===\n"
					+ "1. Adicionar aluno\n"
					+ "2. Listar alunos\n"
					+ "3. Buscar aluno por nome\n"
					+ "4. Mostrar aprovados\n"
					+ "5. Mostrar reprovados\n"
					+ "6. Calcular média da turma\n"
					+ "0. Sair\n"
					+ "Escolha:");
		
			opcao = sc.nextInt();
			
			
		}while(opcao != 0);
		
	}

}
