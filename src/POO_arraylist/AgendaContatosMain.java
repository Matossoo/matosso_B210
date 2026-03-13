package POO_arraylist;

import java.util.*;

public class AgendaContatosMain {

	public static void main(String[] args) {
		
		ArrayList<Contato> contatos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {

            System.out.println("\n=== AGENDA DE CONTATOS ===");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Buscar por nome");
            System.out.println("4. Remover contato");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao) {
            
            case 1:
            	
            }
            	

	}while(opcao != 0);
		System.out.println("programa encerrado");

}
}