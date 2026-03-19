package exer_heranca;
import java.util.*;
public class TesteProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Autor: ");
		String autor = sc.nextLine();
		
		Livro l = new Livro(nome, preco, quantidade, autor);
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Preço: ");
		preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		quantidade = sc.nextInt();
		
		System.out.print("Autor: ");
		int garantia = sc.nextInt();
		
		Eletronico e = new Eletronico(nome,preco,quantidade, garantia);
		
		e.exibirDados();
		l.exibirDados();
		
		
		sc.close();
	}
}
