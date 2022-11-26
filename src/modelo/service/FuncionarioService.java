package modelo.service;

import modelo.dao.FuncionarioDao;
import modelo.entidade.Funcionario;

public class FuncionarioService {
	
	 private FuncionarioDao dao;

	    public FuncionarioService() {
	        this.dao = new FuncionarioDao();
	    }
	    
	    
	    
	                                                                                           
	    public void salvar(Funcionario calculo) {
	        dao.salvar(calculo);
	    } 
	    public void deletar(Funcionario calculo) {
	        dao.deletar(calculo);
	    }
	    
	    public void editar(Funcionario calculo) {
	        dao.alterar(calculo);
	    }
	    
	    public Funcionario pesquisar(Funcionario calculo) {
	     return dao.pesquisar(calculo);
	    }
	    
	
	
	
	
	
	
	

}