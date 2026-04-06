package banco_dados;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PessoaDAO {

	//create
	public void inserir(Pessoas p) throws SQLException{
		String sql = "INSERT INTO Pessoas(nome, idade, cpf) VALUES(?, ?, ?)";
		//try com recursos
		try(Connection conn = Conexao.conectar();
				PreparedStatement stmt = conn.prepareStatement(sql)){
				
			stmt.setString(1,p.getNome());
			stmt.setInt(2,p.getIdade());
			stmt.setString(3, p.getCpf());
			
			stmt.executeUpdate();
			System.out.println("Pessoa inserida com Sucesso!");
		}
	}
	
	//real listar todas as pessoas
	public List<Pessoas> listar()throws SQLException{
		
		List<Pessoas> lista = new ArrayList<>();
		String sql = "SELECT * FROM pessoas";
		
		try (Connection conn = Conexao.conectar();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)){
			
			while (rs.next()) {
				lista.add(new Pessoas(
						rs.getInt("id"),
						rs.getString("nome"),
						rs.getInt("idade"),
						rs.getString("cpf")
						));
			}
			
			return lista;
			
		}
		
		
	}
	
}
