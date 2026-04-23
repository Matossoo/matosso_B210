package Conexoes_exercicio;

import java.sql.*;
import java.util.*;

public class GameDAO {

    public void inserir(Game g) {
        String sql = "INSERT INTO game(titulo, plataforma, genero, anoLancamento, precoAluguel) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, g.getTitulo());
            stmt.setString(2, g.getPlataforma());
            stmt.setString(3, g.getGenero());
            stmt.setInt(4, g.getAnoLancamento());
            stmt.setDouble(5, g.getPrecoAluguel());

            stmt.executeUpdate();
            System.out.println("Game cadastrado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public List<Game> listar() {
        List<Game> lista = new ArrayList<>();
        String sql = "SELECT * FROM game";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Game(
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("plataforma"),
                    rs.getString("genero"),
                    rs.getInt("anoLancamento"),
                    rs.getDouble("precoAluguel")
                ));
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return lista;
    }
}