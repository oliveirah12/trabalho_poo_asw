package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.entidade.Guiche;
import modelo.entidade.Servico;

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
			return null;}
	
	
	public Guiche servicoNome ( Guiche id) {
		
		Connection conn ;
		PreparedStatement stmt ;
		ResultSet consulta1;
		ResultSet consulta2;
		ResultSet consulta3;
	    ArrayList servicos = new ArrayList ();
		
		String sql1 =" SELECT servico1 , nomeservico FROM guiche \r\n"
				+ "inner JOIN servico   on servico1 = idServico  WHERE idGUICHE LIKE  ?;\r\n"
				+ " ;  ";
		String sql2 =" SELECT servico2 , nomeservico FROM guiche \r\n"
				+ "inner JOIN servico   on servico2 = idServico  WHERE idGUICHE LIKE  ?;\r\n"
				+ " ;  ";
		String sql3 =" SELECT servico3 , nomeservico FROM guiche \r\n"
				+ "inner JOIN servico   on servico3 = idServico  WHERE idGUICHE LIKE  ?;\r\n"
				+ " ;  ";
		
		conn  = new Conexao ().Conexao();
		  try {
			  
			  stmt = conn.prepareStatement(sql1); 
	          stmt.setLong(1, id.getNumeroGuiche() );
	          consulta1 =  stmt.executeQuery();
	         
	          
	          if (consulta1.next()) {
	        	    id.setnServico1(consulta1.getString("nomeservico"));
	        	    stmt.execute();
	  	            stmt.close();
	          }else {return null ;}
	          
	          stmt = conn.prepareStatement(sql2); 
	          stmt.setLong(1, id.getNumeroGuiche() );
	          consulta2 =  stmt.executeQuery();
	          if (consulta2.next()) {
	        	    id.setnServico2(consulta2.getString("nomeservico"));
	        	    stmt.execute();
	  	            stmt.close();
	          }else {return null ;}
	          
	          stmt = conn.prepareStatement(sql3); 
	          stmt.setLong(1, id.getNumeroGuiche() );
	          consulta3 =  stmt.executeQuery();
	          if (consulta3.next()) {
	        	    id.setnServico3(consulta3.getString("nomeservico"));
	        	    stmt.execute();
	  	            stmt.close();
	          }else {return null ; } 
			  
		  } catch (SQLException erro) {
			  JOptionPane.showMessageDialog(null," servico guichedao "+erro);
		  }
		return id;
		
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	








