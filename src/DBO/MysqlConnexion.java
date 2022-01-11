package DBO;
import java.sql.*;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MysqlConnexion {
//-----------------------------------------------
	public static Connection getConnection() {
		
		try {
			MysqlDataSource ds=new MysqlDataSource();
			ds.setUrl("jdbc:mysql://localhost:3306/gestionfacture");
			ds.setUser("root");
			ds.setPassword("");
			Connection Mysql=ds.getConnection();
			System.out.println("Connexion etablir ! ");
		return Mysql;
		}catch(SQLException ex) {
			 ex.printStackTrace();
	            return null ;
		}
	}

	
	
//------------------------------------------------	
}
