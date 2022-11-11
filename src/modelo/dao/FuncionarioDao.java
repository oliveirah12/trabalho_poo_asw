package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import modelo.entidade.Funcionario;




public class FuncionarioDao {
	
private	    Resultset rPesquisa  ;
private 	Funcionario  fPesquisa = new Funcionario () ;

	Connection conn ;
	PreparedStatement stmt ;
	ResultSet consulta ;
	ArrayList<Funcionario> lista = new ArrayList<> ();
	
	Funcionario fu = new Funcionario ();
	
	
	
	public void salvar(Funcionario funcionario) {    	
		
    //	Conexao conexao = new Conexao();
		
        String sql = "INSERT INTO " +
                "funcionario (nome, matricula, cargo,senha) " +
                "VALUES (?,?,?,?)";
        
        conn  = new Conexao ().Conexao();
        
        try {
        	
        
        	
           stmt = conn.prepareStatement(sql);  
        	
            stmt.setString(1, funcionario.getNome());
			stmt.setLong(2,   funcionario.getMatricula());
			stmt.setString(3, funcionario.getCargo());
			stmt.setString(4, funcionario.getSenha());
			
		
			
			
			stmt.execute();
		    JOptionPane.showMessageDialog(null," mensagem salva ");
            stmt.close();
          }
        
     
        catch (SQLException erro) {
        	 JOptionPane.showMessageDialog(null," funcionarioDao "+erro);
          } }
	
	
	public void deletar(Funcionario funcionario) {    
		
		 
		  
    	
        String sql = "delete from funcionario where matricula=?";
        conn  = new Conexao ().Conexao();
      
        
        try {
        	
        	stmt = conn.prepareStatement(sql);
        	stmt.setLong(1,   funcionario.getMatricula());
			
			stmt.execute();
		    JOptionPane.showMessageDialog(null," funcionario deletado ");
            stmt.close();
          }
        
     
        catch (SQLException e) {
            e.printStackTrace();
          } }
	
     public void alterar(Funcionario funcionario) {    
	
        String sql = "update funcionario set  Nome = ?,matricula =? ,cargo = ? , senha =? WHERE matricula = ?";
        conn  = new Conexao ().Conexao();
      
        
        try {
        	
        	stmt = conn.prepareStatement(sql);

            stmt.setString(1, funcionario.getNome());
 			stmt.setLong(2,   funcionario.getMatricula());
 			stmt.setString(3, funcionario.getCargo());
 			stmt.setString(4, funcionario.getSenha());
 			stmt.setLong(5,   funcionario.getMatricula());
 			
			stmt.execute();
		    JOptionPane.showMessageDialog(null," funcionario alterado ");
            stmt.close();
          }
        
     
        catch (SQLException erro ) {
        	 JOptionPane.showMessageDialog(null," alterarDao " +erro );
          } }	
	
	
	
	
	
	
	 public Funcionario pesquisarFuncionario (Funcionario funcionario ){ 
		 
		 
		 String sql = "select * from funcionario where matricula=?";
		 conn  = new Conexao ().Conexao();
		 Funcionario f =new Funcionario();
		  
		
		
        try {        
        	stmt = conn.prepareStatement(sql);
        	stmt.setLong(1,   funcionario.getMatricula());
        	
            consulta =  stmt.executeQuery();
            
            
            if (consulta.next()) {
            
            f.setNome(consulta.getString("nome"));
            f.setMatricula(consulta.getInt("matricula"));
            f.setCargo(consulta.getString("cargo"));
            f.setSenha(consulta.getString("senha")); 
            
          
            
            return f ;
            
            }else {    return null ;
            
         
            } }
        
     
        catch (SQLException erro) {
        	 JOptionPane.showMessageDialog(null," funcionarioDao "+erro);
            
             }
		return f;}


	


	
	
	
	
	



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

