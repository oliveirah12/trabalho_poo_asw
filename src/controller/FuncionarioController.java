package controller;





import javax.swing.JOptionPane;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

import modelo.dao.FuncionarioDao;
import modelo.dao.LoginDao;
import modelo.entidade.Funcionario;
import modelo.service.FuncionarioService;



public class FuncionarioController {
	
	/*  public void executa(Frame frame) {
		   
		    Funcionario   funcionario = new Funcionario();
		    
		    funcionario.setNome      (frame. getTxtNome().getText());
		    funcionario.setMatricula (Integer.parseInt(frame.getTxtMatricula().getText()));
		    funcionario.setCargo     (frame. getTxtCargo() .getText());
		    funcionario.setSenha     (frame. getTxtSenha() .getText());
	        
	        FuncionarioService service = new FuncionarioService();
	        
	        service.salvar(funcionario);
	       
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   public void editar(AdminManterFuncionario frame) {
		   
		    funcionario = new Funcionario();
		    
		    funcionario.setNome(frame. getTxtNome().getText());
		    funcionario.setMatricula(Integer.parseInt(frame.getTxtMatricula().getText()));
		    funcionario.setCargo(frame. getTxtCargo() .getText());
		    funcionario.setSenha(frame. getTxtSenha() .getText());
	        
	        FuncionarioService service = new FuncionarioService();
	        
	        service.editar(funcionario);
	       
		   
		   
	   }
	   
	   
	   
	   public void deleta(AdminManterFuncionario frame) {
		   
		    funcionario = new Funcionario();
		    
		    funcionario.setNome(frame. getTxtNome().getText());
		    funcionario.setMatricula(Integer.parseInt(frame.getTxtMatricula().getText()));
		    funcionario.setCargo(frame. getTxtCargo() .getText());
		    funcionario.setSenha(frame. getTxtSenha() .getText());
	        
	        FuncionarioService service = new FuncionarioService();       
	   
	        service.deletar(funcionario);}*/
	   
	   public void df() {}
	   
	   public  Funcionario pesquisar( Funcionario id ) {
		       
		  
		    FuncionarioService fpe =  new FuncionarioService();
	        return   fpe.pesquisar(id);        
	       }
}