package modelo.service;

import java.util.ArrayList;

import modelo.dao.GerarSenhaDao;
import modelo.dao.LoginDao;
import modelo.entidade.Funcionario;
import modelo.entidade.InformarSenha;
import modelo.entidade.Senha;

public class GerarSenhaService {
	
	
	private GerarSenhaDao  dao;

    public GerarSenhaService() {
        this.dao = new GerarSenhaDao ();
    }
    
    public void gerarSenha(Senha calculo) {
    dao.gerarSenha(calculo);
    }
	
    public Senha informarSenha() {
        
		return  dao.informarSenha() ;
	
    }
        
 public Senha chamarSenhap() {
        
		return  dao.chamarSenhap() ;
	
    }
 
 public void finalizaSenha(Senha calculo) {
	    dao.finaliza(calculo);
	    }

}
