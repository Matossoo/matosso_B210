package crud;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoDAO dao = new ProdutoDAO();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Excluir produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();

                    dao.inserir(new Produto(nome, preco, qtd));
                    break;

                case 2:
                    System.out.println("\n=== Produtos ===");
                    for (Produto p : dao.listar()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("ID do produto: ");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();

                    System.out.print("Novo preço: ");
                    double novoPreco = sc.nextDouble();

                    System.out.print("Nova quantidade: ");
                    int novaQtd = sc.nextInt();

                    dao.atualizar(new Produto(idUpdate, novoNome, novoPreco, novaQtd));
                    break;

                case 4:
                    System.out.print("ID para excluir: ");
                    int idDelete = sc.nextInt();

                    dao.excluir(idDelete);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}