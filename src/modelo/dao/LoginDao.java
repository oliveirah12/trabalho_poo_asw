package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.Statement;
import modelo.entidade.Funcionario;
import com.mysql.cj.xdevapi.Statement;

public class LoginDao {
	
	Connection conn ;
	PreparedStatement stmt ;

	public boolean login  ;
	private Funcionario f ;
	

	public ResultSet login(Funcionario funcionario) {
		
		 conn  = new Conexao ().Conexao();	
         
         try {  
        	 String sql = "select * from funcionario where nome = ? and senha=?";
        			
        stmt = conn.prepareStatement(sql);
      
        stmt.setString(1,funcionario.getNome());
        stmt.setString(2,funcionario.getSenha());
        
        
      	 ResultSet consulta  =  stmt.executeQuery();
      	 
      
      	 
      	 return consulta ;
                   
         	}
    
      
         catch (SQLException erro) {
          
        	 JOptionPane.showMessageDialog(null,"usuario dao "+erro);  
             return null ;
              }
 		
 		 
         
         
         
	
		
		
		
		
		
		
		
	
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
	}




	}
	
	

