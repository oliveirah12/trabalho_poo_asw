package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.entidade.Funcionario;
import modelo.entidade.Guiche;

public class GuicheDao {
	Connection conn ;
	PreparedStatement stmt ;
   


	
	public Guiche  entradaGuiche (Guiche guiche) {  
		
	
		Connection conn ;
		PreparedStatement stmt ;
		ResultSet consulta ;
	   
			
		   String sql = "update guiche set  F_matricula = ?  WHERE idGUICHE = ?";
	       String sql1 =" select *from guiche where idGUICHE = ?   ";
	        conn  = new Conexao ().Conexao();
	        
	        try {
	        	
	        	
	           stmt = conn.prepareStatement(sql);  
	        	
	            stmt.setLong(1, guiche.getFuncinarioGuiche());
	            stmt.setLong(2, guiche.getNumeroGuiche() );
	            
	            stmt.execute();
	            stmt.close();
	            
	            
	            stmt = conn.prepareStatement(sql1);
	            stmt.setLong(1, guiche.getNumeroGuiche() );
	        	
	            consulta =  stmt.executeQuery();
	            
	            
	            if (consulta.next()) {
	            
	            guiche.setServico1(consulta.getInt("servico1"));
	            guiche.setServico2(consulta.getInt("servico2"));
	            guiche.setServico3(consulta.getInt("servico3"));
	            
	            
	            stmt.execute();
			    JOptionPane.showMessageDialog(null," mensagem salva ");
	            stmt.close();
	            return guiche;   
	            }
	            else {    return null ;}
            
	         
            
	            
	            
	            
	          }
	        catch (SQLException erro) {
	        	 JOptionPane.showMessageDialog(null," Guiche Dao "+erro);
	          }
			return null; }
	
	
	
	
	
	
	
	
	
	
	
}







