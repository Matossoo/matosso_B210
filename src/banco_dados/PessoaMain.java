package banco_dados;

import java.util.*;

public class PessoaMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Informe seu nome: ");
			String nomeDig = s.nextLine();
			
			System.out.println("Informe sua idade: ");
			int idadeDig = s.nextInt();
			s.nextLine();
			
			System.out.println("Informe seu CPF: ");
			String cpfDig = s.nextLine();
			
			Pessoas natalino = new Pessoas (nomeDig, idadeDig, cpfDig);
			
			PessoaDAO natalinoDAO = new PessoaDAO();
			natalinoDAO.inserir(natalino);
			
			//leitura do banco de dados
			List<Pessoas> lista = natalinoDAO.listar();
			
			for(Pessoas p : lista) {
				System.out.println(p);
			}
			
			
		}catch(Exception e){
			System.out.println("Erro no banco: " + e.getMessage());
		}
		
		
		s.close();
	}

}
