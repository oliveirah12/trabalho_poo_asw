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
	

	public Funcionario login(Funcionario funcionario) {
		
	
		 Funcionario f = new Funcionario();
		 conn  = new Conexao ().Conexao();	
         
         try {  
        	 String sql = "select * from funcionario where nomeFuncionario = ? and senha=?";
        			
        stmt = conn.prepareStatement(sql);
      
        stmt.setString(1,funcionario.getNome());
        stmt.setString(2,funcionario.getSenha());
        
        
      	 ResultSet consulta  =  stmt.executeQuery();
      	
      	 if (consulta.next()) {
           
             f.setCargo(consulta.getString("cargo"));
             return f ;
             }
      
     // 	JOptionPane.showMessageDialog(null,"= "+ consulta.getString("cargo"));	
      	 else {	 JOptionPane.showMessageDialog(null,"senha ou usuario incorreto"); 
      	return null ; }
      	 	 
         }catch (SQLException erro) {
          
        	 JOptionPane.showMessageDialog(null,"usuario dao "+erro);  
             return null ;
             }  }}
	
	

