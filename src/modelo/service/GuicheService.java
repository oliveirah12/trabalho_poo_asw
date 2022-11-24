package modelo.service;

import modelo.dao.FuncionarioDao;
import modelo.dao.GuicheDao;
import modelo.entidade.Funcionario;
import modelo.entidade.Guiche;
import modelo.entidade.Senha;

public class GuicheService {
	
	
	
	
	 private GuicheDao dao;

	    public GuicheService() {
	        this.dao = new GuicheDao();
	    }
	    
	    
	    
	                                                                                           
	    public Guiche entradaGuiche( Guiche g) {
	        
			return  dao.entradaGuiche( g ) ;
			}

}
