package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import modelo.entidade.ControleAtendente;
import modelo.entidade.Funcionario;
import modelo.entidade.Guiche;
import modelo.entidade.Senha;
import modelo.entidade.Servico;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;


public class SenhaDao {
	
	Connection conn ;
	PreparedStatement stmt ,consultaSenha ;
	ResultSet   ultimaSenha , consulta ;
	private int ultimaSenhabanco = 0 ;
	private String teste ;
	private ArrayList  listaSenha  = new ArrayList() ;
	
	public void gerarSenha (Senha senha) {    	
		
	 
	 String sqlbdn= "select max(idSENHA) as id from  senha" ;
	 
	 
	 
	 
	 String sql = "INSERT INTO " +
	                "senha (idSENHA, SERVICO_idServico, PRIORIDADE_idPrioridade) " +
	                "VALUES (?,?,?)";
	        
	 conn  = new Conexao ().Conexao();
	        
	        try {
	        	
	        	 
	           consultaSenha = conn.prepareStatement(sqlbdn);   
	           ultimaSenha = consultaSenha.executeQuery();
	           if (ultimaSenha.next()) {
	        	   ultimaSenhabanco=(ultimaSenha.getInt("id"));
	           }
	           stmt = conn.prepareStatement(sql);  
	           
	           
	           ultimaSenhabanco = ultimaSenhabanco + 1 ;
	          
	           stmt.setLong(1, + ultimaSenhabanco  );
	           stmt.setLong(2, senha. getServico());
			   stmt.setLong(3, senha.getPrioridade());
			   
			   
			   
			   
				stmt.execute();
			    JOptionPane.showMessageDialog(null," Senha gerada");
	            stmt.close();
	              }
	        
	     
	        catch (SQLException erro) {
	        	 JOptionPane.showMessageDialog(null," senhadao"+erro);
	          } }

	     public Senha informarSenha () {   
	    	 
	    	 	Senha s = new Senha ();
		 
		 		String sql = " SELECT * FROM senha where idSENHA =  " +  ultimaSenhabanco ;
		        
		 		conn  = new Conexao ().Conexao();
		        
		        try { 
		        	
		         
		           consultaSenha = conn.prepareStatement(sql);   
		           consulta =   consultaSenha .executeQuery();
		           
		           
		           if (consulta.next()) {
	           
		       
		           s.setNumero(consulta.getInt("idSENHA"));
		           s.setPrioridade (consulta.getInt("PRIORIDADE_idPrioridade"));
		      //   s.setHoraData ( consulta.getTime("data_senha"));
		           
		         
		           
		           consultaSenha.execute();
				   JOptionPane.showMessageDialog(null," retornar senha");
				   consultaSenha.close();
		          
				   
		           }
				   
				   
					
		              }
		        
		     
		        catch (SQLException erro) {
		        	 JOptionPane.showMessageDialog(null," informar "+erro);
		          }
				return s; }
	     
	     
	     public Senha chamarSenhap() {
	    	 
	    	 String sql = "SELECT min(idSENHA),PRIORIDADE_idPrioridade FROM senha WHERE senha_status = 'Cadastrada'and PRIORIDADE_idPrioridade = 1 ;";
			 conn  = new Conexao ().Conexao();
			 
			  
		
			
	        try {        
	        	stmt = conn.prepareStatement(sql);
	            consulta =  stmt.executeQuery();
	            Senha ls =new Senha();	
	            
	            
	            if (consulta.next()) {	
	            
	            
	            
	            ls.setNumero(consulta.getInt("min(idSENHA)"));
	            ls.setPrioridade(consulta.getInt("PRIORIDADE_idPrioridade"));
	            
	        
	            }
	            stmt.execute();
	            
			    JOptionPane.showMessageDialog(null," lista gerada ");
	            stmt.close();
	          
	            
	            return ls ;
	            
	             }
	        
	     
	        catch (SQLException erro) {
	        	 JOptionPane.showMessageDialog(null," lista SenhaDao "+erro);
	            
	             }
			return null;}
	     
	     
   public Senha chamarSenha(Senha senha) {
	    	 
	    	 String sql = "SELECT min(idSENHA),PRIORIDADE_idPrioridade FROM senha "
	    	 		+ "WHERE senha_status = 'Cadastrada'and PRIORIDADE_idPrioridade = ? AND SERVICO_idServico = ? ;";
			 conn  = new Conexao ().Conexao();
			 
			  
		
			
	        try {  
	        	
	        	
	        	
	        	stmt = conn.prepareStatement(sql);
	        	stmt.setLong(1,   senha. getPrioridade());
	        	stmt.setLong(2,   senha. getServico());
	            consulta =  stmt.executeQuery();
	            Senha ls =new Senha();	
	            
	            
	            if (consulta.next()) {	
	 	 
	            ls.setNumero(consulta.getInt("min(idSENHA)"));
	            ls.setPrioridade(consulta.getInt("PRIORIDADE_idPrioridade"));
	            
	        
	            }
	            stmt.execute();
	            stmt.close();
	          
	            
	            return ls ;
	            
	             }
	        
	     
	        catch (SQLException erro) {
	        	 JOptionPane.showMessageDialog(null," lista SenhaDao "+erro);
	            
	             }
			return null;}

  public void status_hora(Senha idSenha ,ControleAtendente at) {
	          String sql = "update senha set  senha_status = ? ,"+at.getHorario()+"=now()  WHERE idSENHA = ?;";
			  conn  = new Conexao ().Conexao();
	
	        try {        
	        	stmt = conn.prepareStatement(sql);

	            stmt.setString(1,at.getStatus());
	            stmt.setLong(2,idSenha.getNumero());
	            
	            stmt.execute();
			    JOptionPane.showMessageDialog(null,"Dado armazenado");
	            stmt.close();
                }
	        catch (SQLException erro) {
	        	 JOptionPane.showMessageDialog(null," lista SenhaDao "+erro);
	            
	             }}
  
}
