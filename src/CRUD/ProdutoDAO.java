package crud;

import java.sql.*;
import java.util.*;

public class ProdutoDAO {

    // CREATE
    public void inserir(Produto p) {
        String sql = "INSERT INTO produto(nome, preco, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPreco());
            stmt.setInt(3, p.getQuantidade());

            stmt.executeUpdate();
            System.out.println("Produto cadastrado!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // READ
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getDouble("preco"),
                    rs.getInt("quantidade")
                ));
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return lista;
    }

    // UPDATE
    public void atualizar(Produto p) {
        String sql = "UPDATE produto SET nome=?, preco=?, quantidade=? WHERE id=?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPreco());
            stmt.setInt(3, p.getQuantidade());
            stmt.setInt(4, p.getId());

            int linhas = stmt.executeUpdate();

            if (linhas > 0) {
                System.out.println("Produto atualizado!");
            } else {
                System.out.println("ID não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // DELETE
    public void excluir(int id) {
        String sql = "DELETE FROM produto WHERE id=?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int linhas = stmt.executeUpdate();

            if (linhas > 0) {
                System.out.println("Produto excluído!");
            } else {
                System.out.println("ID não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}