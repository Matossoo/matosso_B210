package Conexoes_exercicio;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoDAO dao = new ProdutoDAO();

        try {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();

            ProdutoModel p = new ProdutoModel(nome, preco, qtd);
            dao.inserir(p);

            System.out.println("\n=== Produtos cadastrados ===");
            for (ProdutoModel prod : dao.listar()) {
                System.out.println(prod);
            }

        } catch (Exception e) {
            System.out.println("Erro de entrada!");
        } finally {
            sc.close();
        }
    }
}