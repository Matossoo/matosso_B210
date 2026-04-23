package Conexoes_exercicio;

import java.util.*;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameDAO dao = new GameDAO();

        try {
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Plataforma: ");
            String plataforma = sc.nextLine();

            System.out.print("Gênero: ");
            String genero = sc.nextLine();

            System.out.print("Ano: ");
            int ano = sc.nextInt();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            Game g = new Game(titulo, plataforma, genero, ano, preco);
            dao.inserir(g);

            System.out.println("\n=== Games cadastrados ===");
            for (Game game : dao.listar()) {
                System.out.println(game);
            }

        } catch (Exception e) {
            System.out.println("Erro de entrada!");
        } finally {
            sc.close();
        }
    }
}