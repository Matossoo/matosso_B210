package exer_heranca;
import java.util.*;
public class TesteCachorroMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Raça: ");
		String raca = sc.nextLine();
		
		Cachorro c = new Cachorro(nome, idade, raca);
		
		c.exibirDados();
		
		sc.close();
	}

}
