package banco_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
		
		private static final String url = "jdbc:mysql://localhost:3306/teste_java";
		private static final String user = "root";
		private static final String password = "root";
		
		public static Connection conectar() throws SQLException{
			return DriverManager.getConnection(url, user, password);
		}
	}

