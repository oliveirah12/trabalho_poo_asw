package modelo.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.cj.xdevapi.Statement;

public class Conexao {
	Connection conn = null;
   
	
	
	public Connection Conexao() {
		
	
		
		try { 	 
			
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stop", "root","");

		
			
		} catch (SQLException erro ) {
			 JOptionPane.showMessageDialog(null," conexaobd "+ erro.getMessage());
		}
		
		return conn ;
		
	}
	

	
	
	public Connection getConn() {
		return conn;
	}
	
	public void setConn(Connection conn) {
		this.conn = conn;
	}
}


