package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_top",
                "root",
                "senha"
            );
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            return null;
        }
    }
}