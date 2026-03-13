package POO_arraylist;

import java.util.*;

import java.util.Scanner;

public class ProdutoMain {

	public static void main(String[] args) {
		
		ArrayList<Produto> produtos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("=== CADASTRO DE PRODUTOS ===");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Contar produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){

            case 1:
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();

                Produto p = new Produto(nome, preco, quantidade);
                produtos.add(p);

                System.out.println("Produto cadastrado com sucesso!\n");
            break;

            case 2:
                if(produtos.isEmpty()){
                    System.out.println("Nenhum produto cadastrado.");
                }else{
                    for(Produto p2 : produtos) {
                    	p2.exibirDados();
                    }
                }
            break;

            case 3:
                System.out.println("Total de produtos cadastrados: " + produtos.size());
            break;

            case 0:
                System.out.println("Encerrando sistema...");
            break;

            default:
                System.out.println("Opção inválida!");
        }

    }while(opcao != 0);

    sc.close();
}
}