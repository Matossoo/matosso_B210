package Conexoes_exercicio;

import java.sql.*;
import java.util.*;

public class ProdutoDAO {

    public void inserir(ProdutoModel p) {
        String sql = "INSERT INTO produto(nome, preco, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPreco());
            stmt.setInt(3, p.getQuantidade());

            stmt.executeUpdate();
            System.out.println("Produto inserido!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public List<ProdutoModel> listar() {
        List<ProdutoModel> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new ProdutoModel(
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
}