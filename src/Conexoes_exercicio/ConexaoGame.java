package Conexoes_exercicio;

import java.sql.*;

public class ConexaoGame {
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db_locadora",
                "root",
                "senha"
            );
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}